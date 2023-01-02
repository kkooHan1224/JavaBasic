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
	
	<h2>Aries 양자리</h2>
	양자리는 다른 사람의 말을 경청하는데 어려움을 겪고,<br>
	주도적으로 시작하며 즉흥적이고 창조적입니다.<br>
	자신이 하는 모든 일을 스스로 칭찬하려고 합니다.<p/>
	
	성장 미션으로는 감정이 격해질 때는 심호흡해보기,<br>
	모든 일에 남 탓을 하기보다는 자신의 실수를 인정하기가 있습니다.
</body>
</html>