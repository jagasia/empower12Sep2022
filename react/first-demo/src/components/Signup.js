import { Component } from "react";

export class Signup extends Component {
    render() {
        return (<div>
            <form>
                Name
                <input type="text" name="" id="" class="form-control" formControlName="name" />
                Email <input type="email" name="" id="" class="form-control" formControlName="email" />
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