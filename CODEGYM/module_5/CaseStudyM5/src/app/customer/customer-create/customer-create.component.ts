import { Component, OnInit } from '@angular/core';
import { CustomerType } from 'src/app/model/customerType';
import { CustomerTypeService } from 'src/app/service/customer-type.service';
import { CustomerService } from 'src/app/service/customer.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {

  customerTypes: CustomerType[] = [];

  constructor(private customerTypeService: CustomerTypeService,
              private customerService: CustomerService,
              private router: Router) {
                this.customerTypeService.getAll().subscribe(next => this.customerTypes = next)
              }
              
  createForm: FormGroup = new FormGroup({
    name: new FormControl(),
    dob: new FormControl(),
    phone: new FormControl(),
    customerType: new FormControl()
  })
  
  ngOnInit(): void {
  }

  submit(): void {
    if (this.createForm.valid){
      this.customerService.saveCustomer(this.createForm.value).subscribe(next => {
        alert("Save success!!!");
        this.router.navigateByUrl('/customer/list')
      })
    }
  }
}
