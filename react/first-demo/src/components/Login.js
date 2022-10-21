
function Login(props) {
    return (<div class="text-left">
        <h2>{props.label}</h2>
        <form>
            User Name: <input type="text" name="" id="" class="form-control" value={ props.username } />
            Password: <input type="password" name="" id="" class="form-control" /><br />
            <input type="button" value="Login" class="btn btn-success" />&nbsp;
            <input type="reset" value="Reset" class="btn btn-warning" /><br/>
        </form>
    </div>);
}

export default Login;