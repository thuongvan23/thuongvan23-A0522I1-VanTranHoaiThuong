import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { Customer } from 'src/app/model/customer';
import { CustomerType } from 'src/app/model/customerType';
import { CustomerTypeService } from 'src/app/service/customer-type.service';
import { CustomerService } from 'src/app/service/customer.service';

@Component({
  selector: 'app-customer-update',
  templateUrl: './customer-update.component.html',
  styleUrls: ['./customer-update.component.css']
})
export class CustomerUpdateComponent implements OnInit {

  updateForm: FormGroup;
  customer: Customer;
  id: number;
  customerTypes: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomerTypeService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
                this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
                  this.id = +paramMap.get('id');
                  this.customerService.findById(this.id).subscribe(next => {
                    this.customer = next;
                    this.updateForm = new FormGroup({
                      name: new FormControl(this.customer.name),
                      phone: new FormControl(this.customer.phone),
                      dob: new FormControl(this.customer.dob),
                      customerType: new FormControl(this.customer.customerType)
                    });
                  });
                });
              }

  ngOnInit(): void {
    this.getCustomerType()
  }

  getCustomerType(){
    this.customerTypeService.getAll().subscribe(next => this.customerTypes = next)
  }

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  updateCustomer(){
    const customer = this.updateForm.value;
    this.customerService.updateCustomer(this.id, customer).subscribe(next => {
      alert("Success!");
      this.router.navigateByUrl("/customer/list");
    })
  }
}
