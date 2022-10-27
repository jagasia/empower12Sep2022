import logo from './logo.svg';
// import './App.css';
import './green.css';

function App() {
  const s={
    color:'red',
    textAlign:'center'
  }
  return (
    
    <div className="App">
      <p> This is a paragraph </p>
      <p style={s}> Second paragraph </p>
    </div>
  );
}

export default App;
