import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-forgot-password',
  templateUrl: './forgot-password.component.html',
  styleUrls: ['./forgot-password.component.css']
})
export class ForgotPasswordComponent implements OnInit {
  passwordCheck;
  cpasswordCheck;
  check;
  message;
  constructor(private service:ServiceService) { }

  passwords(event){

    this.passwordCheck=event.target.value;

  }
  cPassword(event){
    
    this.cpasswordCheck=event.target.value;
    if(this.passwordCheck===this.cpasswordCheck){
         this.check=false;
         console.log(false);
    }
    else{
      console.log(true)
      this.check=true;
    }
  }

  forgotPassword(form){
    console.log(form.value);
this.service.forgotPassword(form.value).subscribe(data=>{
this.message=data.description;
})
  }
  ngOnInit() {
  }

}
