import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from 'src/app/base-list.component';
import { ServiceLocatorService } from 'src/app/service-locator.service';

@Component({
  selector: 'app-orderlist',
  templateUrl: './orderlist.component.html',
  styleUrls: ['./orderlist.component.css']
})
export class OrderlistComponent extends BaseListCtl {

  public form = {
    error: false, // Error flag
    message: null, // Error or success message
    preload: [], // Preload data
    data: { id: null }, // Form data
    inputerror: {}, // Form input error messages
    searchParams: {}, // Search form parameters
    searchMessage: null, // Search result message
    list: [], // Search list
    pageNo: 0 // Pagination
  };

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.ORDER, locator, route);
  }

  // Optionally, you can override methods from BaseListCtl here if needed

  

}
