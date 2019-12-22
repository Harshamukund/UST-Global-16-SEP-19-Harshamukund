import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http: HttpClient) { }

  loginData(form): Observable<any> {
    return this.http.post<any>(`http://localhost:8081/login`, form);
  }

  registerUser(form): Observable<any> {
    return this.http.post<any>(`http://localhost:8081/register`, form);
  }

  forgotPassword(form) {
    return this.http.post<any>(`http://localhost:8080`, form);
  }

  changePassword(form): Observable<any> {
    return this.http.post<any>('http://localhost:8080', form);
  }

  composeEmail(data): Observable<any> {
    const user = JSON.parse(localStorage.getItem('user'));
    return this.http.get<any>(`http://localhost:8081/compose?email=${data.email}&subject=${data.subject}&message=${data.message}&id=${user[0].id}`);

  }

  adddraftMail(form, email) {
    return this.http.post<any>(`http://localhost:8080`, form, email);
  }

  inbox(): Observable<any> {
    const user = JSON.parse(localStorage.getItem('user'));
    console.log(user[0].id);
    return this.http.get<any>(`http://localhost:8081/inbox?to_id=${user[0].id}`);
  }

  deleteEmail(form): Observable<any> {
    return this.http.delete<any>(`http://localhost:8081/parmanent/id=${form}`);
  }

  sentMail(): Observable<any> {
    const user = JSON.parse(localStorage.getItem('user'));
    return this.http.get<any>(`http://localhost:8081/send?from_id=${user[0].id}`);
  }

  draftMail(): Observable<any> {
    const user = JSON.parse(localStorage.getItem('user'));
    console.log(user);

    return this.http.get<any>(`http://localhost:8081/draftlist?to_id=${user[0].id}`);
  }


}
