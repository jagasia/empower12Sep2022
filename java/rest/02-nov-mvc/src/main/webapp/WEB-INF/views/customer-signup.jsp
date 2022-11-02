<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
				<form method="POST" action="customer/signup">
					Email:<input type="email" name="email" class="form-control" />
					Password:<input type="password" name="password"  class="form-control" />
					Confirm Password:<input type="password" name="cpassword"  class="form-control" />
					Name:<input type="text" name="name"  class="form-control" />
					Phone:<input type="text" name="phone"  class="form-control" /><br/>
					<input type="submit" value="Sign Up" class="btn btn-success" />&nbsp;
					<input type="reset" value="Reset" class="btn btn-warning" />
				</form>
			</div>
			<jsp:include page="col-3.jsp" />
		</div>
	</div>
</body>
</html>