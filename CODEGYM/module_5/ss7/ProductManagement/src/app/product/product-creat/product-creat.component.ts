import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from 'src/app/service/product.service';
import { CategoryService } from 'src/app/service/category.service';
import { Category } from 'src/app/model/category';

@Component({
  selector: 'app-product-creat',
  templateUrl: './product-creat.component.html',
  styleUrls: ['./product-creat.component.css']
})
export class ProductCreatComponent implements OnInit {

  categories: Category[] = [];

  constructor (private productService: ProductService,
               private categoryService: CategoryService,
               private router: Router) {
        this.categoryService.getAll().subscribe(next => this.categories = next);
  }

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl('', [Validators.required, Validators.maxLength(100), Validators.minLength(3)]),
    description: new FormControl('', [Validators.required, Validators.minLength(10)]),
    price: new FormControl('', [Validators.required, Validators.min(5000)]),
    category: new FormControl('', [Validators.required])
  });

  ngOnInit(): void {
    console.log(this.categories);
  }

  submit(): void {
    console.log(this.productForm.value)
    if (this.productForm.valid) {
      this.productService.saveProduct(this.productForm.value).subscribe(next =>{
        alert("Product saved");
        this.router.navigateByUrl('/product/list')})
    }
  }
}
