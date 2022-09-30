<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= 20*20 %>
<br/>
<%	out.print(20*20);	 %>
<br/>
<%	out.print(new Date());		 %>
<br/>
<%= new Date() %>
<br/>
<form action="login">
	<%-- Username:<input type="text" name="username" value="<% out.print(request.getParameter("username")); %>" /><br/> --%>
	Username:<input type="text" name="username" value="${param.username }" /><br/>
	Password:<input type="password" name="password" /><br/>
	<input type="submit" value="Login" />
</form>
<br/>
<%
	if(request.getParameter("status")!=null)
	{
		String status=request.getParameter("status");
		if(status.equals("Failure"))
			out.print("<font color=red>"+status+"</font>");
		else
			out.print("<font color=green>"+status+"</font>");
	}
	

%>



</body>
</html>