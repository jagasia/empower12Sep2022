<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
  <h1>Products Page</h1>
  <p>CRUD operations using Spring data JPA!</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
    </div>
    <div class="col-sm-4">
    	<form method="POST" action="product">
    		Id:<input type="number" name="id" class="form-control" />
    		Name:<input type="text" name="name" class="form-control" />
    		Price:<input type="number" name="price" class="form-control" />
    		<br/>
    		<input type="submit" value="Add" name="add" class="btn btn-success" />&nbsp;
    		<input type="submit" value="Update" name="update" class="btn btn-warning" />&nbsp;
    		<input type="submit" value="Delete" name="delete" class="btn btn-danger" />&nbsp;
    		
    	</form>
    </div>
    <div class="col-sm-4">
    </div>
  </div>
  <HR/>
  <div class="row">
  	<div class="col-sm-2"></div>
  	<div class="col-sm-8">
  		<table class="table table-bordered table-striped table-hover">
  			<thead>
  				<th>Id</th><th>Name</th><th>Price</th><th></th>
  			</thead>
  			<c:forEach var="p" items="${products }">
  				<tr>
  					<td>${p.id }</td>
  					<td>${p.name }</td>
  					<td>${p.price }</td>
  					<td><a href="select?id=${p.id }">Select</a></td>
  				</tr>
  			</c:forEach>	
  		</table>
  	</div>
  	<div class="col-sm-2"></div>
  </div>
</div>
	
</body>
</html>