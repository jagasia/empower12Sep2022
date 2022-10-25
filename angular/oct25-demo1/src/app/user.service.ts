import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  URL = "http://localhost:8082"
  constructor(private http: HttpClient) { }

  login(authRequest: any) {
    return this.http.post(this.URL + "/login", authRequest)
  }

  signup(user: any) {
    return this.http.post(this.URL + "/signup", user);
  }

  publish() {
    this.checkLoginStatus();
  }

  checkLoginStatus() {
    const myObservable = new Observable(observer => {
      setTimeout(() => {
        var status = 'login';
        var loggedUserName = localStorage.getItem("jwt");
        // alert(loggedUserName)
        if (loggedUserName != null) {
          status = 'logout';
          // alert('changing to Logout');
        }
        // for(var i=1;i<=10;i++)
        observer.next(status);
      }, 100);
    });
    return myObservable;
  }

}


