<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = "korea Football";
%>
<html>
<body>
	<h1>Include Tag Example1</h1>
	<jsp:include page="includeTagTop1.jsp"/>
	include ActionTag의 Body입니다.
</body>
</html>