import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  message;
  products;
  isProducts = false;
  totalAmount = 0;
  constructor(private service: ProductService, private route: Router) {
    this.selectedItems();
  }

  ngOnInit() {
  }
  selectedItems() {
    if (this.service.selectedProducts === null) {
      this.message = 'Please Select Products';
    } else {
      this.products = this.service.selectedProducts;
      console.log('cart items are', this.products);
      this.isProducts = true;
      for (let val in this.products) {
        this.totalAmount = this.totalAmount + this.products[val].price;
      }
      console.log(this.totalAmount);
    }
  }

  orderProducts() {
    console.log(this.products);
    let total_gst = this.totalAmount * 0.1;
    this.service.orderProducts(this.products, this.totalAmount, total_gst).subscribe( data => {
      console.log('Products are ordered');
      this.route.navigate(['order-list']);
    }, err => {
      console.log('error');
    }, () => {
      console.log('success');
    })
  }
}
