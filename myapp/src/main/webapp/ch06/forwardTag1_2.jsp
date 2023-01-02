<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
%>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>Forward Tag Example2</h1>
	당신의 아이디는 <b><%=id%></b>이고<p/>
	패스워드는 <b><%=pwd%></b> 입니다.
</body>
</html>