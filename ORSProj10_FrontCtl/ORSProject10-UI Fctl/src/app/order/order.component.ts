import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.ORDER, locator, route); // Update endpoint
  }

  submit() {
    const _self = this;
    console.log('in submit');
    console.log(this.form);
    console.log(this.form.data);
    this.serviceLocator.httpService.post(this.api.save, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.data.id = res.result.data;
      
      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("----------Order----------.");

      } else {
        _self.form.error = true;
        if (res.result.inputerror) {
          _self.form.inputerror = res.result.inputerror;
        }
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }

  submit1() {
    const _self = this;
    console.log(this.form + " submit running start");
    console.log(this.form.data + " form data going to be submitted");
    this.serviceLocator.httpService.post(this.api.search, this.form.data, function (res) {
      _self.form.message = '';
      _self.form.inputerror = {};
      _self.form.data.id = res.result.data;
     
      if (res.success) {
        _self.form.message = "Data is saved";
        _self.form.data.id = res.result.data;

        console.log(_self.form.data.id);
        console.log("--------------------.");

      } else {
        _self.form.error = true;
        _self.form.inputerror = res.result.inputerror;
        _self.form.message = res.result.message;
      }
      _self.form.data.id = res.result.data;
      console.log('FORM', _self.form);
    });
  }

  onUpload(userform: FormData) {
    this.submit();
    console.log(this.form.data.id + '---- after submit');
  }

  validateForm(form) {
    let flag = true;
    const validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.productName); // Update to productName
    console.log(form.productName);
    flag = flag && validator.isNotNullObject(form.productId); // Update to productId
    console.log(form.productId);
    flag = flag && validator.isNotNullObject(form.dob); // Update to dob
    console.log(form.dob);
    flag = flag && validator.isNotNullObject(form.amount); // Update to amount
    console.log(form.amount);
    flag = flag && validator.isNotNullObject(form.quantity);
    
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    console.log(form.id + ' populate form in order component');
    form.productName = data.productName; // Update to productName
    form.productId = data.productId; // Update to productId
    form.dob = data.dob; // Update to dob
    form.amount = data.amount;
    form.quantity = data.quantity; // Update to amount
  }

  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }

  test() {
    // Test method, currently empty
  }
}
