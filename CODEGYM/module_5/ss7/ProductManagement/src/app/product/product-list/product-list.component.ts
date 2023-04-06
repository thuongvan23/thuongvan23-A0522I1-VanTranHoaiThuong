import { Component, OnInit } from '@angular/core';
import { ProductService } from 'src/app/service/product.service';
import { Product } from 'src/app/model/product';
import { Category } from 'src/app/model/category';
import { CategoryService } from 'src/app/service/category.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products: Product[] = [];
  product: Product;
  categories: Category[] = [];

  constructor(private productService: ProductService,
              private categoryService: CategoryService
    ) {}

  ngOnInit(): void {
    this.getAll();
    this.getCategory();
  }

  getAll(){
    this.productService.getAll().subscribe(next => this.products = next);
  }

  getCategory(){
    this.categoryService.getAll().subscribe(next => this.categories = next)
  }

  deleteProduct(id: number): void {
    this.productService.findById(id).subscribe(next => {
      this.product = next;
      if (confirm('Bạn có chắc muốn xóa sản phẩm '+this.product.name+' ?')) {
        this.productService.deleteProduct(id).subscribe(next => {this.getAll()});
      }
    })
  }

  findByCategory(categoryName: string){
    if (categoryName != null){
      this.productService.findByCategory(categoryName).subscribe(next => {this.products = next})
    }
  }

  findByTextExist(searchInput: string){
    if (searchInput != null){
      this.productService.findByTextExis(searchInput).subscribe(next => {this.products = next})
    }
  }
}
