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
	
	<h2>Libra 천칭자리</h2>
	천칭자리는 균형 잡힌 조화를 원하고 좋아합니다.<br>
	귀족같은 귀여운 외모의 소유자가 많고<br>
	거절을 잘 하지 못하며 우유부단한 성격이 있습니다.<br>
	자신에게 관대해서 무질서 해질 수 있습니다.<p/> 

	성장 미션으로는 수면의 질을 위해<br>
	꾸준한 호흡운동해보기와 거절해보기가 있습니다.
</body>
</html>