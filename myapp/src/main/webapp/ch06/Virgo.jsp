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
	
	<h2>Virgo 처녀자리</h2>
	처녀자리는 봉사정신과 희생정신이 투철하고 일과 건강을 중요시 여깁니다.<br>
	자신의 한계를 잘 알고 있고 그 능력안에서 일을 하기를 원합니다.<br>
	분석적이고 완벽주의적인 성향이 있으며 까다롭고 세심합니다.<p/>​

	성장미션으로는 운동을 게을리하지 않기, 명상과 호흡 시간 갖기가 있습니다.
</body>
</html>