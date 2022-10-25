import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;

  constructor(private fb:FormBuilder) {
    this.loginForm=this.fb.group({
      username:[],
      password:[]
    });
   }

  ngOnInit(): void {
  }

}
