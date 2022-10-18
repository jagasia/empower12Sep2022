import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  baseUrl='http://localhost:8081/customer';

  constructor(private http:HttpClient) { }

  getAllCustomers()
  {
    return this.http.get(this.baseUrl);
  }

  findCustomerById(id:any)
  {
    return this.http.get(this.baseUrl+"/"+id);
  }

  addCustomer(customer:any){
    return this.http.post(this.baseUrl,customer);
  }

  updateCustomer(customer:any){
    return this.http.put(this.baseUrl,customer);
  }

  deleteCustomer(id:any){
    return this.http.delete(this.baseUrl+"/"+id);
  }
}
