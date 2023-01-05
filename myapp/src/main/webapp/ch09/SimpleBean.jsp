<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mybean" class="ch09.SimpleBean" scope="page" />
<%
	String message = request.getParameter("messageA");
%>
<jsp:setProperty name="mybean" property="message" value="<%=message%>" />

<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>간단한 빈 프로그래밍</h1>
	<br/>
	Message: <jsp:getProperty name="mybean" property="message" />
</body>
</html>