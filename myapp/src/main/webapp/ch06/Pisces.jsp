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
	
	<h2>Pisces 물고기자리</h2>
	물고기자리는 예술적 기질이 있고,<br>
	물질적인 욕심보다 소소한 행복을 누리며 사는 사람이 많습니다.<br> 
	상상력이 풍부하고 공,사 구분이 약한 편입니다.<p/> 

	성장 미션으로는 연민과 사랑 구분하기,<br>
	일상에서 만나는 상대방 말도 들어보기가 있습니다.
</body>
</html>