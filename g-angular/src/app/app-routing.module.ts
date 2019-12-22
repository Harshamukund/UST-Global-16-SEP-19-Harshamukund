import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterFormComponent } from './register-form/register-form.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { ChangePasswordComponent } from './change-password/change-password.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { DraftmailComponent } from './draftmail/draftmail.component';
import { SentmailComponent } from './sentmail/sentmail.component';


const routes: Routes = [
  {path : 'home', component: HomeComponent},
  {path : 'register', component: RegisterFormComponent},
  {path : 'login', component:  LoginFormComponent},
  {path : 'changepassword', component: ChangePasswordComponent},
  {path : 'forgotpassword' , component: ForgotPasswordComponent},
  {path: 'inbox', component: HomeComponent},
  {path: 'trash', component: DraftmailComponent},
  {path: 'sentmail', component: SentmailComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
