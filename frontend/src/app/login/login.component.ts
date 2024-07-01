import { Component } from '@angular/core';
import {FormBuilder, FormGroup, FormsModule, ReactiveFormsModule} from "@angular/forms";
import {MatFormField, MatInput} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {UsersService} from "../users.service";
import {HttpClient} from "@angular/common/http";
import {User} from "../users";
import {Router} from "@angular/router";
import {MatLabel} from "@angular/material/form-field";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule,
    MatInput,
    MatLabel,
    MatButton,
    MatFormField,
    ReactiveFormsModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginForm: FormGroup =  this.fb.group({
    username: [''],
    password: [''],
  })

  constructor(private http: HttpClient, private usersService: UsersService,private  fb : FormBuilder,private router: Router) {
  }

  Submit(){
    console.log(this.loginForm.value);
    this.usersService.Login(this.loginForm.value).subscribe(
      value => {this.Logged(value)},
    );
  }

  Logged(user:any){
    console.log(user);

    if (user && user.id) {
      localStorage.setItem("userId", String(user.id));
      this.router.navigate(['/'])
    }
  }
}
