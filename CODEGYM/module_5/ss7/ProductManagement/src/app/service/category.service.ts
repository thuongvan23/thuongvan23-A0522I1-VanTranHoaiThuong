import { Injectable } from '@angular/core';
import { Category } from '../model/category';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  constructor(private httpClient: HttpClient) { };

  getAll(): Observable<Category[]> {
    return this.httpClient.get<Category[]>("http://localhost:3000/categories")
  }
}
