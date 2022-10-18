import { Component, OnInit } from '@angular/core';
import {  FormBuilder, Validators} from '@angular/forms'
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customerForm:any;
  customers:any;

  constructor(private fb:FormBuilder, private cs:CustomerService) { 
    this.customerForm=this.fb.group({
      id:[],
      name:[],
      phone:[],
      email:[]
    });
  }

  ngOnInit(): void {
    //call the getAllCustomers method of cs
    this.cs.getAllCustomers().subscribe((data)=>{
      this.customers=data;
      console.log(data);
    });
  }

  fnAddCustomer()
  {
    console.log(this.customerForm.value);
    this.cs.addCustomer(this.customerForm.value).subscribe((data)=>console.log(data));    
  }

  fnUpdateCustomer()
  {
    this.cs.updateCustomer(this.customerForm.value).subscribe((data)=>console.log(data));    
  }

  fnDeleteCustomer()
  {
    var id=this.customerForm.controls.id.value;
    console.log(id);
    this.cs.deleteCustomer(id).subscribe((data)=>console.log(data));
    

  }

}
