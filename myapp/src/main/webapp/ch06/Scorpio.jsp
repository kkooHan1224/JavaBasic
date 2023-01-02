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
	
	<h2>Scorpio 전갈자리</h2>
	전갈자리는 보는 눈이 정확하며 자신을 잘 드러내지 않고<br>
	비밀스러운 부분이 있습니다.<p/>
	
	성장 미션으로는 집착하는 마음이 생길 때 호흡과 명상 해보기,<br>
	용서하는 마음을 가져보기, 깊은 생각들을 밖으로 표현해보기가 있습니다.
</body>
</html>