<%@page contentType="text/html; charset=UTF-8"%>
<%
	String name = request.getParameter("name");
%>
<html>
	<head>
		<style>div{text-align: center;}</style>
	</head>
	<body>
		<div><h1>한국아이티전문학원</h1></div>
		<h6>환영합니다.어서오세요!!!<%=name%>님!!!</h6>
	</body>
</html>