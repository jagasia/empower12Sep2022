import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;

  constructor(private fb:FormBuilder, private us:UserService) {
    this.loginForm=this.fb.group({
      username:[],
      password:[]
    });
   }

  ngOnInit(): void {
  }

  fnLogin()
  {
    this.us.login(this.loginForm.value).subscribe((data)=>{
      console.log(data);
      if(data!=null)
      {
        //success
        var token={"jwt":""};
        token=<any>data;
        localStorage.setItem("jwt",token.jwt);
      }
      
    });
  }

}
