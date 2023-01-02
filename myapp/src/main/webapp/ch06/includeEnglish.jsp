<%@page contentType="text/html; charset=UTF-8"%>
<%
	String name = request.getParameter("name");
%>
<html>
	<head>
		<style>div{text-align: center;}</style>
	</head>
	<body>
		<div><h1>Korean Information Technology Institute!!</h1></div>
		<h6>Welcome!!!<%=name%>!!!</h6>
	</body>
</html>