<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String name;
	name = request.getParameter("name");
	String bloodType = request.getParameter("bloodType");
%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>Forward Tag Example2</h1>
	<jsp:forward page='<%=bloodType + ".jsp"%>'>
		<jsp:param name="name" value="<%=name%>"/>
	</jsp:forward>
</body>
</html>