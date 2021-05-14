<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h4><c:out value="${error}"/></h4>

	<form action="/testcode" method="POST">
		<h2>What is the code?</h2>
	    <input type="password" name="password">
		<button type="submit">Try Code</button>
	</form>
</body>
</html>