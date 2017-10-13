<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.niit.estore.backend.model.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Sucessfull</h1>
	<%
		//Customer customer=(Customer) request.getAttribute("customer");
		//out.println(customer.getPassword());
	
	%>
	${ customer.password }
	${ customer.name }
	${ customer.email }
</body>
</html>