import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from 'src/app/model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>("http://localhost:3000/customers");
  }

  saveCustomer(customer: Customer): Observable<Customer> {
    return this.httpClient.post<any>("http://localhost:3000/customers", customer);
  }

  deleteCustomer(id): Observable<Customer[]> {
    return this.httpClient.delete<Customer[]>("http://localhost:3000/customers/" + id);
  }

  findById(id): Observable<Customer>{
    return this.httpClient.get<Customer>("http://localhost:3000/customers/" + id);
  }

  updateCustomer(id: number, customer: Customer): Observable<Customer[]>{
    return this.httpClient.put<Customer[]>("http://localhost:3000/customers/" + id, customer)
  }

  findByText(text): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>("http://localhost:3000/customers?q=" + text)
  }
}
