import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductCreatComponent } from './product/product-creat/product-creat.component';
import { ProductUpdateComponent } from './product-update/product-update.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';


const routes: Routes = [{
  path: 'product/list',
  component: ProductListComponent
  }, {
  path: 'product/create',
  component: ProductCreatComponent
  }, {
    path: 'product/edit/:id',
    component: ProductUpdateComponent
  }, {
    path: 'product/:id',
    component: ProductDetailComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
