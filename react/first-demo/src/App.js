
import './App.css';
import Login from './components/Login';
import { Signup } from './components/Signup';

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
      <Signup />
    </div>
    <div class="col-sm-4">
      <Login />
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>        
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
  </div>
</div>
    </div>
  );
}

export default App;
