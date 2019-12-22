import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchemail'
})
export class SearchemailPipe implements PipeTransform {

  transform(emails:Email[], search:string): any {
    if (search === undefined) {
      return emails;
    } else {
    return emails.filter((value) => {
      return value.email.toLowerCase().includes(search.toLowerCase());
    });
    }
  }

}
