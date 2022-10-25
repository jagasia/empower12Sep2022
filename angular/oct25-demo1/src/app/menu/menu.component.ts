import { Component, OnInit, OnChanges, DoCheck, SimpleChanges } from '@angular/core';
import { UserService } from '../user.service';


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit, OnChanges, DoCheck {
  status:any;
  name:string|null='';

  constructor(private us:UserService) { }

  ngOnChanges(changes: SimpleChanges): void {
    
  }
  ngDoCheck(): void {
    this.us.checkLoginStatus().subscribe((data)=>{
      this.status=data;
      this.name=localStorage.getItem("name");
      
    });
  }

  ngOnInit(): void {
    //if jwt token is found in the localStorage, then he has already logged in. So we show Logout option
    var jwt=localStorage.getItem("jwt");
    if(jwt==null)
    {
      //they have not logged in
      this.status="login";
    }else{
      this.status="logout";
    }
  }

}
