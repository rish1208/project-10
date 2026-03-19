import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-vehicle',
  templateUrl: './vehicle.component.html',
  styleUrls: ['./vehicle.component.css']
})
export class VehicleComponent extends BaseCtl {

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
    flag = flag && validator.isNotNullObject(form.vehicle_number);
    flag = flag && validator.isNotNullObject(form.service_type);
    flag = flag && validator.isNotNullObject(form.owner_name);
    flag = flag && validator.isNotNullObject(form.service_date);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.vehicle_number = data.vehicle_number;
    form.service_type = data.service_type;
    form.owner_name = data.owner_name;
    form.service_date = data.service_date;
  }

}
