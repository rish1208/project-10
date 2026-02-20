import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent extends BaseCtl {

  errorMessageTitle: string = '';
  errorMessageClientName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.LOCATION, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.country);
    flag = flag && validator.isNotNullObject(form.location_status);
    flag = flag && validator.isNotNullObject(form.state);
    flag = flag && validator.isNotNullObject(form.city);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.country = data.country;
    form.location_status = data.location_status;
    form.state = data.state;
    form.city = data.city;
  }



}


