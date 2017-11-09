<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<%@include file="header.jsp" %>
<body>
	<h1>Login Page</h1>
</body>
<%@include file="footer.jsp" %>
	<form action="login" method="POST">
		<input type="text" name="username" placeholder="Email" /><br>
		<input type="password" name="password" placeholder="Password" /><br>
		<input type="submit" name="butSubmit" value="Login">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
</html>