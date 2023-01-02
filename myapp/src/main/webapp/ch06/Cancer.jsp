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
	
	<h2>Cancer 게자리</h2>
	게자리는 모성애로 가득한 가슴 따뜻한 사람으로<br>
	감수성이 풍부하고 자기 방어 기질이 강합니다.<br>
	기분변화가 심하고 무엇이든 쉽게 버리지 못하는 과거 지향적인 성격이 있습니다.<p/> 
	
	성장 미션으로는 혼자 여행을 시도해 낯선 환경에 도전해보기,<br>
	누군가에게 댓가를 바라지않기가 있습니다.
</body>
</html>