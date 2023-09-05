<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	index 기본 페이지 <br><br>
	<%= request.getAttribute("index") %>
	<hr>
	<a href="login">login</a>
	<a href="logout">logout</a>
</body>
</html>