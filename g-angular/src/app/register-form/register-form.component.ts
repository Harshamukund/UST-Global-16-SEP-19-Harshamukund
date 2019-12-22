import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  passwordCheck;
  cpasswordCheck;
  check;
  constructor(private service: ServiceService, private router: Router) { }
  passwords(event) {

    this.passwordCheck = event.target.value;

  }
  cPassword(event) {

    this.cpasswordCheck = event.target.value;
    if (this.passwordCheck === this.cpasswordCheck) {
      this.check = false;
      console.log(false);
    }
    else {
      console.log(true)
      this.check = true;
    }
  }
  registerData(form) {
    console.log(form.value);
    this.service.registerUser(form.value).subscribe(res => {
      console.log(res);
      this.router.navigateByUrl('/login');
      form.reset();
    }, err => {
      console.log(err);

    });
  }


  ngOnInit() {
  }

}
