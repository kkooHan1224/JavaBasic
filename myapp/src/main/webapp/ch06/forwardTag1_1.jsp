<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>Forward Tag Example1</h1>
	forward Tag의 포워딩 되기 전의 페이지입니다.
		<jsp:forward page="forwardTag1_2.jsp"/>
</body>
</html>