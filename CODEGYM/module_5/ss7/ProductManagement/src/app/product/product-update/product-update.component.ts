import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ProductService } from '../../service/product.service';
import { Product } from '../../model/product';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Router } from '@angular/router';
import { Category } from 'src/app/model/category';
import { CategoryService } from 'src/app/service/category.service';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {

  productForm: FormGroup;
  product: Product;
  id: number;
  categories: Category[];

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private activatedRoute: ActivatedRoute,
              private router: Router) {
                  this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
                    this.id = +paramMap.get('id');
                    this.productService.findById(this.id).subscribe(next => {this.product = next 
                      this.productForm = new FormGroup({
                        id: new FormControl(this.product.id),
                        name: new FormControl(this.product.name),
                        price: new FormControl(this.product.price),
                        description: new FormControl(this.product.description),
                        category: new FormControl(this.product.category)
                      });
                    });
                });
   }

  ngOnInit(): void {
    this.getCategories();
    console.log(this.categories);
  }

  compareFn(c1: any, c2: any): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  getCategories(){
    this.categoryService.getAll().subscribe(next => {this.categories = next});
  }

  updateProduct(id: number){
    const product = this.productForm.value;
    this.productService.updateProduct(id, product).subscribe(next => {
      alert("Success!");
      this.router.navigateByUrl("/product/list");
    })
  }
}
