import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;

  constructor(private fb:FormBuilder, private us:UserService, private router:Router) {
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
        localStorage.setItem("name",this.loginForm.controls.username.value);
        this.us.publish();
        //redirect to Products page!
        this.router.navigate(['product']);
      }
      
    });
  }

}
