import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-order-list',
  templateUrl: './order-list.component.html',
  styleUrls: ['./order-list.component.css']
})
export class OrderListComponent implements OnInit {

  list;
  totalAmount = 0;
  constructor(private service: ProductService) {
    this.orderList();
  }

  ngOnInit() {
  }
  orderList() {
    this.list = this.service.selectedProducts;
    if (this.service.selectedProducts === null) {
      console.log('empty');
    } else {
      this.list = this.service.selectedProducts;
      for (let val in this.list) {
        this.totalAmount = this.totalAmount + this.list[val].price + (0.1 * this.list[val].price);
      }
      
      console.log(this.totalAmount);
    }
  }
}
