import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductCreatComponent } from './product/product-creat/product-creat.component';
import { ProductListComponent } from './product/product-list/product-list.component';

import { ReactiveFormsModule } from '@angular/forms';
import { ProductUpdateComponent } from './product/product-update/product-update.component';
import { ProductDetailComponent } from './product/product-detail/product-detail.component';

import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './navbar/navbar.component';

import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    ProductCreatComponent,
    ProductListComponent,
    ProductUpdateComponent,
    ProductDetailComponent,
    NavbarComponent,
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
