import { Component, OnInit } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-hotellist',
  templateUrl: './hotellist.component.html',
  styleUrls: ['./hotellist.component.css']
})
export class HotellistComponent extends BaseListCtl implements OnInit {

  myKey = "";
    errorMessageClientName: string = '';
  
  
    public form = {
      error: false,
      message: null,
      preload: [],
      data: { id: null },
      inputerror: {},
      searchParams: {},
      searchMessage: null,
      list: [],
      pageNo: 0
    };
  
    base64Data: any;
    retrieveResonse: any;
    message: string;
    
  
    constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
      super(locator.endpoints.HOTEL, locator, route);
    }


}
