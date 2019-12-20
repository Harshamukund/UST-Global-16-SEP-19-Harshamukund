import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-get-all',
  templateUrl: './get-all.component.html',
  styleUrls: ['./get-all.component.css']
})
export class GetAllComponent implements OnInit {

  products = new Array();
  selectedProduct;
  message;
  constructor(private service: ProductService, private route: Router) {
    this.getAll();
  }

  ngOnInit() {
  }
  move() {
    this.route.navigate(['cart']);
  }
  addCart(product) {
    console.log(product);
    this.service.selectedProducts.push(product);
    console.log(this.service.selectedProducts);
  }
  editProduct(product) {
    console.log(product.value);
    this.service.updateProduct(product.value).subscribe( data => {
      console.log(data);
      this.message = data.message;
      this.route.navigate(['get-all']);
    }, err => {
      console.log('error');
    }, () =>{
      console.log('success');
    })
  }
  updateProduct(product) {
    console.log(product);
    this.selectedProduct = product;
  }
  getAll() {
    this.service.getAllProducts().subscribe( data =>{
      console.log(data.bean);
      this.products = data.bean;
    }, err=>{
      console.log('error');
    }, () => {
      console.log('success')
    });
  }

}
