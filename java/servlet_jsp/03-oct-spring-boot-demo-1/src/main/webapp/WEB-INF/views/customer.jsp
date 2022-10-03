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
Customer Page
<form>
	Id:<input type="number" name="id" /><br/>
	Name:<input type="text" name="name" /><br/>
	Phone:<input type="text" name="phone" /><br/>
	<input type="submit" />
</form><br/>
<table border="1">
<thead>
	<tr>
		<td> Id </td><td> Name </td><td> Phone </td>
	</tr>
</thead>
<c:forEach var="c" items="${customers }">
	<tr>
		<td>${c.id }</td>
		<td>${c.name }</td>
		<td>${c.phone }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>