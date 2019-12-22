import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-sentmail',
  templateUrl: './sentmail.component.html',
  styleUrls: ['./sentmail.component.css']
})
export class SentmailComponent implements OnInit {
emails;
selectMail;
  constructor(private service:ServiceService) {
    this.sentmail();
   }
  sentmail(){
    return this.service.sentMail().subscribe(data=>{
      console.log(data);
      this.emails=data.email;

    })
  }
selectedEmail(email){
  this.selectMail=email;
}
  ngOnInit() {
  }

}
