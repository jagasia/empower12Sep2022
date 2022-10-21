import { Component } from "react";
import customerService from "../services/customer-service";



export class Customer extends Component
{
    constructor()
    {
        super();
        this.state={id:'',name:'',phone:'',email:''};
        this.fnAdd=this.fnAdd.bind(this);
        this.fnUpdate=this.fnUpdate.bind(this);
        this.fnDelete=this.fnDelete.bind(this);
        this.fnOnChange=this.fnOnChange.bind(this);
        
    }

    fnAdd()
    {
        // alert('adding');
        console.log(this.state);
        customerService.addCustomer(this.state).then((response)=>{
            console.log(response);
        });   
    }

    fnUpdate()
    {
        console.log(this.state);
        customerService.updateCustomer(this.state).then((response)=>{
            console.log(response);
        });   
    }

    fnDelete()
    {
        console.log(this.state);
        customerService.deleteCustomer(this.state.id).then((response)=>{
            console.log(response);
        });   
    }

    fnOnChange(event)
    {
        this.setState({[event.target.name]:event.target.value});
        console.log(this.state);
    }

    render()
    {
        return(<div class="text-left">
            Id: <input type="number" name="id" class="form-control" onChange={this.fnOnChange} />
            Name: <input type="text" name="name" class="form-control" onChange={this.fnOnChange} />
            Phone: <input type="text" name="phone" class="form-control" onChange={this.fnOnChange} />
            Email: <input type="email" name="email" class="form-control" onChange={this.fnOnChange} /><br/>
            <input type="button" value="Add" class="btn btn-success" onClick={this.fnAdd} />&nbsp;
            <input type="button" value="Update" class="btn btn-warning" onClick={this.fnUpdate} />&nbsp;
            <input type="button" value="Delete" class="btn btn-danger" onClick={this.fnDelete} />
        </div>);
    }
}