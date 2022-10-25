import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  URL = "http://localhost:8082"
  constructor(private http: HttpClient) { }

  login(authRequest: any) {
    return this.http.post(this.URL+"/login", authRequest)
  }

  signup(user: any) {
    return this.http.post(this.URL+"/signup", user);
  }
  
}
