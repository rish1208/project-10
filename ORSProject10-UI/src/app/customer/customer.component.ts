import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent extends BaseCtl {
  errorMessageTitle: string = '';
  errorMessageClientName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.CUSTOMER, locator, route);
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.clientName);
    flag = flag && validator.isNotNullObject(form.location);
    flag = flag && validator.isNotNullObject(form.contactNumber);
    flag = flag && validator.isNotNullObject(form.importance);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.clientName = data.clientName;
    form.location = data.location;
    form.contactNumber = data.contactNumber;
    form.importance = data.importance;
  }




}