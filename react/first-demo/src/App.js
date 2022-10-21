
import './App.css';
import { Customer } from './components/customer';
import { CustomerGrid } from './components/CustomerGrid';
import Login from './components/Login';
import { Signup } from './components/Signup';

function Aboutus()
{
  return (<p>THis is about us</p>);
}

const Contactus=()=>{
  return (<p>Contact us: </p>);
}

function App() {
  return (
    <div className="App">
      <div class="jumbotron text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <Signup name="Rama" />
    </div>
    <div class="col-sm-4">
      <Login username="shashank" label="Registration  Form" />
    </div>
    <div class="col-sm-4">
      <Aboutus /><br/>
      <Contactus /><br/>
      <Customer />
    </div>
  </div>
  <div class="row">
    <div class="col-sm-2"></div>
    <div class="col-sm-8">
      <CustomerGrid />
    </div>
    <div class="col-sm-2"></div>
  </div>
</div>
    </div>
  );
}

export default App;
