import { Component, OnInit } from '@angular/core';
import {  FormBuilder} from '@angular/forms'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  signupForm:any;

  constructor(private fb:FormBuilder) { 
    this.signupForm=this.fb.group({
      name:[],
      email:[],
      phone:[],
      password:[],
      cpassword:[],
      gender:['Female'],
      dateOfBirth:[]
    });
  }

  ngOnInit(): void {
  }

  fnSubmit()
  {
    console.log(this.signupForm.value);
    
  }
}
