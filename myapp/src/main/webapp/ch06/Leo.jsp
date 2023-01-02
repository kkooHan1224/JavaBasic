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
	
	<h2>Aries 물병자리</h2>
	사자자기를 로맨티스트이고 개성이 강하고 자기 표현력이 좋습니다.<br>
	하지만 폼생폼사이고 독단적이며 피드백을 잘 듣지 않습니다.<br> 
	낙관주의가 문제가 될 수 있습니다.<p/>
	성장 미션으로는 우선 순위가 사회적인 것에 있다면<br>
	가정을 돌보는 시간을 가져보기,<br>
	다른 사람의 의견을 경청해보기가 있습니다.
</body>
</html>