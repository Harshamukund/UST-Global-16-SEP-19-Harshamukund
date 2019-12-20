import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(product: any[], search: string): any {
    if (!product) {
      return null;
    }
    if (!search) {
      return product;
    }
    return product.filter(function(item) {
      return JSON.stringify(item).toLowerCase().includes(search.toLowerCase());
    });
  }
}
