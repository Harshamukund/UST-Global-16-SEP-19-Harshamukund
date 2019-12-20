import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  message;
  constructor(private service: ProductService) { }

  ngOnInit() {
  }
  addProduct(product) {
    this.message=null;
    console.log(product.value);
    this.service.addProduct(product.value).subscribe( data =>{
      console.log(data);
      this.message = data.message;
      product.reset();
    }, err => {
      console.log('error');
    }, () => {
      console.log('success');
    })
  }

}
