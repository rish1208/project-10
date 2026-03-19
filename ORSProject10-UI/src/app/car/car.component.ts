import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent extends BaseCtl {

  errorMessageTitle: string = '';
  errorMessagecarName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.CAR, locator, route);
  }
  
  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.car_code);
    flag = flag && validator.isNotNullObject(form.car_name);
    flag = flag && validator.isNotNullObject(form.car_model);
    flag = flag && validator.isNotNullObject(form.car_status);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.car_code = data.car_code;
    form.car_name = data.car_name;
    form.car_model = data.car_model;
    form.car_status = data.car_status;
  }

}
