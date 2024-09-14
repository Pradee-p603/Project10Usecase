import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class EndpointServiceService {

  constructor() { }

  public SERVER_URL = "http://localhost:8084";
  public MESSAGE = this.SERVER_URL + "/Message";
  public USER = this.SERVER_URL + "/User";
  public ROLE = this.SERVER_URL + "/Role";
  public COLLEGE = this.SERVER_URL + "/College";
  public MARKSHEET = this.SERVER_URL + "/Marksheet";
  public STUDENT = this.SERVER_URL + "/Student";
  public SUBJECT = this.SERVER_URL+ "/Subject";
  public POSITION = this.SERVER_URL+ "/Position";
  public LEAD = this.SERVER_URL+ "/Lead";
  public FACULTY = this.SERVER_URL+ "/Faculty";
  public COURSE = this.SERVER_URL + "/Course";
  public TIMETABLE = this.SERVER_URL+ "/TimeTable";
  public JASPERREPORT = this.SERVER_URL+ "/Jasper";
  public SHOPPING_CART = this.SERVER_URL+ "/ShoppingCart";
  public ORDER = this.SERVER_URL+ "/Order";
  public WISHLIST = this.SERVER_URL+ "/Wishlist";
  public PURCHASE = this.SERVER_URL+ "/Purchase";
  public ASSET= this.SERVER_URL+ "/Asset";
  public PATH= this.SERVER_URL+ "/Path";
  public PRODUCTMANAGEMENT= this.SERVER_URL+ "/ProductManagement";

 
}
