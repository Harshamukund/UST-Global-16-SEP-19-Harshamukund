import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  selectedProducts = new Array();
  constructor(private http: HttpClient) { }
  addProduct(product) {
    return this.http.put<any>('http://localhost:8080/addProduct', product);
  }
  getAllProducts() {
    return this.http.get<any>('http://localhost:8080/get-all');
  }
  updateProduct(product) {
    return this.http.put<any>('http://localhost:8080/updateProduct',product);
  }
  orderProducts(products, total, total_gst) {
    return this.http.post<any>(`http://localhost:8080/generate/${total}/${total}`, products);
  }
}
