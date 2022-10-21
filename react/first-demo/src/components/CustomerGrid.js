import { Component } from "react";
import customerService from "../services/customer-service";

export class CustomerGrid extends Component
{
    constructor()
    {
        super();
        this.state={'customers':[]};
    }
    componentDidMount()
    {
        //call the rest api
        customerService.getAllCustomers().then((response)=>{
            // console.log(response.data);
            this.setState({'customers':response.data});
        });
    }

    render()
    {
        return (<div>
            <table class="table table-bordered table-striped table-hover">
                <thead>
                    <tr>
                        <th>Id</th><th>Name</th><th>Phone</th><th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        this.state.customers.map((c)=>
                            <tr>
                                <td>{c.id}</td>
                                <td>{c.name}</td>
                                <td>{c.phone}</td>
                                <td>{c.email}</td>
                            </tr>
                        )
                    }
                </tbody>
            </table>
        </div>);
    }
}