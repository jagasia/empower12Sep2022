import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {
  message:string='';
  constructor(private us:UserService) { }

  ngOnInit(): void {
    //delete the localStorage jwt
    localStorage.removeItem("jwt");
    this.message="Logged out successfully";
    this.us.publish();
  }

}
