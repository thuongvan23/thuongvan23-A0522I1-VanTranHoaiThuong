import { Injectable } from '@angular/core';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  products: Product[] = [{
    id: 1,
    name: 'IPhone 12',
    price: 2400000,
    description: 'New'
  }, {
    id: 2,
    name: 'IPhone 11',
    price: 1560000,
    description: 'Like new'
  }, {
    id: 3,
    name: 'IPhone X',
    price: 968000,
    description: '97%'
  }, {
    id: 4,
    name: 'IPhone 8',
    price: 7540000,
    description: '98%'
  }, {
    id: 5,
    name: 'IPhone 11 Pro',
    price: 1895000,
    description: 'Like new'
  }];

  constructor() { }

  getAll() {
    return this.products;
  }

  saveProduct(product) {
    this.products.push(product);  
  }

  findById(id: number): Product{
    return this.products.filter(p => p.id === id)[0];
  }

  updateById(id, product: Product){
    if (this.findById(id) != null){
      this.findById(id).name = product.name;
      this.findById(id).price = product.price;
      this.findById(id).description = product.description;
    }
  }

  deleteProduct(id){
    this.products = this.products.filter(product => {
      return product.id !== id;
    });   
  }
}
