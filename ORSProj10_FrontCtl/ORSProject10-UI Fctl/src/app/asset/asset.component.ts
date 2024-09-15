import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-asset',
  templateUrl: './asset.component.html',
  styleUrls: ['./asset.component.css']
})
export class AssetComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute, private httpClient: HttpClient) {
    super(locator.endpoints.ASSET, locator, route);
  }

  submit() {
    var _self = this;
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
        console.log("----------Shopping Cart----------.");

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
    var _self = this;
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

  // validateForm(form) {
  //   let flag = true;
  //   let validator = this.serviceLocator.dataValidator;
  //   flag = flag && validator.isNotNullObject(form.registrationNumber);
  //   console.log(form.name);
  //   flag = flag && validator.isNotNullObject(form.acquisitionDate);
  //   console.log(form.product);
  //   flag = flag && validator.isNotNullObject(form.coverageAmount);
  //   console.log(form.date);
  //   flag = flag && validator.isNotNullObject(form.paintColor);
  //   console.log(form.quantity);
    
  //   return flag;
  // }

  populateForm(form, data) {
    form.id = data.id;
    console.log(form.id + ' populate form in shopping-cart component');
    form.registrationNumber = data.registrationNumber;
    form.acquisitionDate = data.acquisitionDate;
    form.coverageAmount = data.coverageAmount;
    form.paintColor = data.paintColor;
  }

  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }

  validateAlphabetInput(event: KeyboardEvent) {
    const str = event.key;
   
    if (!/^[a-zA-Z\s]*$/.test(str)) {
      event.preventDefault();
    }
  }

  validateMobileInput(event: KeyboardEvent) {
    const newValue = (event.target as HTMLInputElement).value + event.key;
    if (!/^[1-9][0-9]{0,9}$/.test(newValue)) {
      event.preventDefault();
    }
  }
  test() {
    // Test method, currently empty
  }
}