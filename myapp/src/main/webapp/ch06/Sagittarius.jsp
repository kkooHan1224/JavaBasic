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
	
	<h2>Sagittarius 사수자리</h2>
	사수자리는 여행을 좋아하고 화를 잘 내지 않지만 한번 내면 크게 내는 편입니다.<br>
	이상과 목표를 항상 추구하고 타인의 사소한 감정을 잘 알지 못합니다.<p/>​
	
	성장 미션으로는 작고 사소한 일에 관심 가져보기,<br>
	잘못한 일에 있어서는 사과해보기가 있습니다.
</body>
</html>