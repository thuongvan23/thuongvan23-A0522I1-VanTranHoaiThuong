import { Component, OnInit } from '@angular/core';
import { CustomerService } from 'src/app/service/customer.service';
import { Customer } from 'src/app/model/customer';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {

  customers: Customer[] = [];
  customer: Customer;

  constructor(private customerService: CustomerService
              ) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.customerService.getAll().subscribe(next => this.customers = next)
  }

  deleteCustomer(id){
    this.customerService.findById(id).subscribe(next => {
      this.customer = next;
      if (confirm('Bạn có chắc muốn xóa khách hàng '+this.customer.name+' ?')) {
        this.customerService.deleteCustomer(id).subscribe(next => {this.getAll()});
      }
    })
  }

  findByTextExist(text: string){
    this.customerService.findByText(text).subscribe(next => this.customers = next)
  }
}
