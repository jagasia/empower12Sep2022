<%@page import="com.empower.ecom.model.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.empower.ecom.model.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="customer">
<h3>Customer Page</h3>
<table>
	<tr>
		<td>Id</td><td><input type="number" name="id" value="${customer.id }" /><br/></td><td></td>
	</tr>
	<tr>
		<td>Name</td><td><input type="text" name="name" value="${customer.name }" /><br/></td><td></td>
	</tr>
	<tr>
		<td>Phone</td><td><input type="text" name="phone" value="${customer.phone }" /><br/></td><td></td>
	</tr>
	<tr>
		<td><input type="submit" name="btn" value="Add" /></td>
		<td><input type="submit" name="btn" value="Update" />
		<input type="submit" name="btn" value="Delete" /></td>
	</tr>
</table>
</form>

<table border="1">
	<thead>
		<tr>
			<th>Id</th><th>Name</th><th>Phone</th><th></th>
		</tr>
	</thead>
	<tbody>
		<%
			CustomerDao cdao=new CustomerDao();
			List<Customer> customerList=cdao.read();
			session.setAttribute("customers", customerList);			
		%>
		<c:forEach var="c" items="${customers }">
			<tr>
				<td>${c.id }</td>
				<td>${c.name }</td>
				<td>${c.phone }</td>
				<td><a href="select?id=${c.id }">Select</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>