<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container">
		<div class="row">
			<jsp:include page="col-1.jsp" />
			<div class="col-sm-4">
				<!-- check if it is merchant who has logged in -->
				<%
					if(session.getAttribute("merchant")==null)
					{
						out.print("You have not logged in as merchant. Click <a href=\"/showLogin\">here </a>to login now!");
						return;
					}
				%>
				<form method="post" enctype="multipart/form-data" action="/product/productDml">
					Id (auto):<input type="number" name="id" class="form-control" />
					Name:<input type="text" name="name" class="form-control" />
					Description:<input type="text" name="description" class="form-control" />
					Price:<input type="text" name="price" class="form-control" />
					Picture:<input type="file" name="picture" class="form-control" />
					<br/>
					<input type="submit" name="add" value="Add" class="btn btn-success" />&nbsp;
					<input type="submit" name="update" value="Update" class="btn btn-warning" />&nbsp;
					<input type="submit" name="delete" value="Delete" class="btn btn-danger" />&nbsp;
				</form>
			</div>
			<jsp:include page="col-3.jsp" />
		</div>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<table class="text-center table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th>Id</th><th>Name</th><th>Description</th><th>Price</th><th>Picture</th><th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="p" items="${products }">
							<tr>
								<td>${p.id }</td>
								<td>${p.name }</td>
								<td>${p.description }</td>
								<td>${p.price}</td>
								<td>
									<img width="100" src="data:image/jpg;base64,${p.picture1 }" />
								</td>
								<td></td>
							</tr>
						</c:forEach>				
					</tbody>
				</table>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>