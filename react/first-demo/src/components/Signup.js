import { Component } from "react";

export class Signup extends Component {

    constructor(props)
    {
        super(props);
        this.state={name:'',email:'siva'};
        this.fn1=this.fn1.bind(this);
        this.fnSubmit=this.fnSubmit.bind(this);
    }

    fn1(event)
    {
        this.setState({[event.target.name]:event.target.value});
        console.log(this.state);
    }

    fnSubmit()
    {
        alert(this.state.name);
    }

    render() {
        return (<div>
            <form onSubmit={this.fnSubmit}>
                Name
                <input type="text" name="name" id="" class="form-control" formControlName="name" onKeyUp={this.fn1} />
                Email <input type="email" name="email" id="" class="form-control" formControlName="email" onKeyUp={this.fn1} />
                Phone <input type="number" name="" id="" class="form-control" formControlName="phone" />
                Password <input type="password" name="" id="" class="form-control" formControlName="password" />
                Confirm password <input type="password" name="" id="" class="form-control" formControlName="cpassword" />
                Gender <input type="radio" name="gender" id="rdoFemale" formControlName="gender" value="Female" /><label for="rdoFemale">Female</label> &nbsp;
                <input type="radio" name="gender" id="rdoMale" formControlName="gender" value="Male" /><label for="rdoMale">Male</label> &nbsp;
                <input type="radio" name="gender" id="rdoOther" formControlName="gender" value="Other" /><label for="rdoOther">Other</label><br />
                Date Of Birth <input type="date" name="" id="" class="form-control" formControlName="dateOfBirth" />
                <br />
                <input type="submit" value="Sign Up" class="btn btn-success" />&nbsp;
                <input type="reset" value="Reset" class="btn btn-warning" />

            </form>
        </div>);
    }
}