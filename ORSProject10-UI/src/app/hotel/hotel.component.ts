import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-hotel',
  templateUrl: './hotel.component.html',
  styleUrls: ['./hotel.component.css']
})
export class HotelComponent extends BaseCtl {

  errorMessageTitle: string = '';
  errorMessagecarName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.HOTEL, locator, route);
  }
  
  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');

  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.participant_name);
    flag = flag && validator.isNotNullObject(form.block_name);
    flag = flag && validator.isNotNullObject(form.room_number);
    flag = flag && validator.isNotNullObject(form.allotment_date);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.participant_name = data.participant_name;
    form.block_name = data.block_name;
    form.room_number = data.room_number;
    form.allotment_date = data.allotment_date;
  }


}
