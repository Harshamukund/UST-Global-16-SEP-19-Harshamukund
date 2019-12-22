import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
search;
emails;
selectEmail;
message;
  constructor(private service:ServiceService) {
    this.getInbox();
   }
  getInbox(){
    this.service.inbox().subscribe(data=>{
      console.log(data);
      this.emails=data.email;
    })   }
    selectedEmail(email){
      console.log("haiiiiiii")
      this.selectEmail=email;
      console.log(email)
    }
    deletemail(form){
      console.log(form);
      this.service.deleteEmail(form.form.value.id).subscribe(data=>{
        console.log(data);
        this.message=data.description;
      })
    }



  ngOnInit() {
  }

}
