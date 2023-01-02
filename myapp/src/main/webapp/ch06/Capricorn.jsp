<%@ page contentType="text/html; charset=UTF-8"%>
<%
	String name = request.getParameter("name");
	String birthdayMonth = request.getParameter("birthdayMonth");
	String birthdayDay = request.getParameter("birthdayDay");
	String zodiacSign = request.getParameter("zodiacSign");
%>

<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>나의 별자리 찾기 결과</h1>
	<%=name%>님의 생일은
	<%=birthdayMonth%><%=birthdayDay%>일,<p/>
	별자리는 <b><%=zodiacSign%></b>입니다.<p/>
	
	<h2>Capricom 염소자리</h2>
	염소자리에는 규칙적이고 꾸준한 사람이 많은편입니다.<br>
	예의가 바르고 사려가 깊은 반면 인색하고 비관적이고 융통성이 부족합니다.<p/>​

	성장 미션으로는 일상 생활 속 마음적 여유를 가지고 부드러운 마음을 가져보는것이 있습니다.
</body>
</html>