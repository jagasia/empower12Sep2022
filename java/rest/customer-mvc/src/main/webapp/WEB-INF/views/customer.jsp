<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
    <div class="col-sm-4">
      <h3>Column 2</h3>
     	<form:form method="POST" action="customer" modelAttribute="customer">
     		Id:<form:input path="id" type="number" name="id" class="form-control" />
     		Name:<form:input path="name" type="text" name="name" class="form-control" />
     		<form:errors cssStyle="color:red" path="name" /><br/>
     		Phone:<form:input path="phone" type="number" name="phone" class="form-control" />
     		Email:<form:input path="email" type="email" name="email" class="form-control" />
     		<br/>
     		<input type="submit" name="add" value="Add" class="btn btn-success" />&nbsp;
     		<input type="submit" name="update" value="Update" class="btn btn-warning" />&nbsp;
     		<input type="submit" name="delete" value="Delete" class="btn btn-danger" />&nbsp;
     		
     	</form:form>
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>        
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
      <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
    </div>
  </div>
</div>
<div class="row">
    <div class="col-sm-2">
    </div>
    <div class="col-sm-8">
    	<table class="table table-bordered table-striped table-hover">
    		<thead>
    			<th>Id</th><th>Name</th><th>Phone</th><th>Email</th><th></th>
    		</thead>
    		<tbody>
    			<c:forEach var="c" items="${customers }">
    				<tr>
    					<td>${c.id }</td>
    					<td>${c.name }</td>
    					<td>${c.phone }</td>
    					<td>${c.email }</td>    					
    					<td>
    						<a href="/select?id=${c.id }">Select</a>
    					</td>
    				</tr>
    			</c:forEach>
    		</tbody>
    	</table>
    </div>
    <div class="col-sm-2">
    </div>
</div>
</body>
</html>