import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validator } from '@angular/forms';
import { Router } from '@angular/router';
import { ProductService } from 'src/app/service/product.service';

@Component({
  selector: 'app-product-creat',
  templateUrl: './product-creat.component.html',
  styleUrls: ['./product-creat.component.css']
})
export class ProductCreatComponent implements OnInit {

  constructor (private productService: ProductService,
               private router: Router) {}

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    description: new FormControl(),
    price: new FormControl()
  });

  ngOnInit(): void {
  }

  submit(): void {
    // const product = this.productForm.value;
    // this.productService.saveProduct(product);
    // this.productForm.reset();
    console.log(this.productForm.value)
    if (this.productForm.valid) {
      this.productService.saveProduct(this.productForm.value)
      this.router.navigateByUrl('/product/list');
    }
  }
}
