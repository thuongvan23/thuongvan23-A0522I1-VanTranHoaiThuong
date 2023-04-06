import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Product[]> {
    return this.httpClient.get<Product[]>("http://localhost:3000/products");
  }

  saveProduct(product): Observable<any> {
    return this.httpClient.post<any>("http://localhost:3000/products", product); 
  }

  findById(id: number): Observable<Product>{
    return this.httpClient.get<Product>("http://localhost:3000/products/"+id);
  }

  deleteProduct(id): Observable<any>{
    return this.httpClient.delete<Product[]>("http://localhost:3000/products/"+id)
  }

  updateProduct(id: number, product: Product): Observable<Product[]>{
    return this.httpClient.put<Product[]>("http://localhost:3000/products/"+id, product);
  }

  findByCategory(categoryName: string): Observable<Product[]>{
    return this.httpClient.get<Product[]>("http://localhost:3000/products?category.categoryName_like="+categoryName)
  }

  findByTextExis(searchInput: string): Observable<Product[]>{
    return this.httpClient.get<Product[]>("http://localhost:3000/products?q="+searchInput)
  }
}
