import { Component, OnInit } from '@angular/core';
import {  FormBuilder, Validators} from '@angular/forms'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  // template:`<p>this is typed by me</p>
  // <p> this is second line</p>
  
  // `,
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  signupForm:any;

  constructor(private fb:FormBuilder) { 
    this.signupForm=this.fb.group({
      name:['', [Validators.required,Validators.minLength(5), Validators.maxLength(5)]],
      email:['',Validators.required],
      phone:['',Validators.required],
      password:['',Validators.required],
      cpassword:[],
      gender:['Female'],
      dateOfBirth:['',Validators.required]
    });
  }

  ngOnInit(): void {
  }

  get f()
  {
    return this.signupForm.controls;
  }

  fnSubmit()
  {
    
    console.log(this.signupForm.value);
    
  }
}
