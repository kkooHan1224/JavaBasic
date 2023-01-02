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
	집중력이 강한 동시에 마이웨이 형입니다.
</body>
</html>