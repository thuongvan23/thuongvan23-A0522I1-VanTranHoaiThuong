import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductCreatComponent } from './product/product-creat/product-creat.component';


const routes: Routes = [{
  path: 'product/list',
  component: ProductListComponent
  }, {
  path: 'product/create',
  component: ProductCreatComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
