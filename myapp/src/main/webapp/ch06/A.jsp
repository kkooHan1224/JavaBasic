<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String name = request.getParameter("name");
	String bloodType = request.getParameter("bloodType");
%>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>Forward Tag Example2</h1>
	<%=name%>님의 혈액형은
	<b><%=bloodType%></b>형이고<p/>
	인내심이 강한 동시에 끈기도 있는 편입니다.
</body>
</html>