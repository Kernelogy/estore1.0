<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<div class="col-md-2">
					Id
				</div>
				<div class="col-md-2">
					Name
				</div>
				<div class="col-md-2">
					Description
				</div>
				<div class="col-md-2">				
					Price
				</div>
				<div class="col-md-2">
					Action
				</div>
			</div>
		</div>
		<c:forEach items="${products}" var="p">
		<div class="row">
			<div class="col-md-10">
				<div class="col-md-2">
					${p.id}
				</div>
				<div class="col-md-2">
					${p.name}
				</div>
				<div class="col-md-2">
					${p.description}
				</div>
				<div class="col-md-2">
					${p.price}
				</div>
				<div class="col-md-2">
					<a href="edit?id=${p.id}"><span class="glyphicon glyphicon-edit"></span></a>
					<a href="delete?id=${p.id}"><span class="glyphicon glyphicon-trash"></span></a>
				</div>
			</div>
		</div>		
		</c:forEach>
		
	</div>
</body>
</html>