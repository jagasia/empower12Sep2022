<%@page import="com.empower.ecom.model.Customer"%>
<%@page import="java.util.List"%>
<%@page import="com.empower.ecom.model.CustomerDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<td>Id</td><td><input type="number" name="id" /><br/></td><td></td>
	</tr>
	<tr>
		<td>Name</td><td><input type="text" name="name" /><br/></td><td></td>
	</tr>
	<tr>
		<td>Phone</td><td><input type="text" name="phone" /><br/></td><td></td>
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
			for(Customer c:customerList)
			{
				out.print("<tr>");
				out.print("<td>"+c.getId()+"</td>");
				out.print("<td>"+c.getName()+"</td>");
				out.print("<td>"+c.getPhone()+"</td>");				
				out.print("</tr>");
			}
		%>
	</tbody>
</table>
</body>
</html>