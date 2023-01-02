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
	
	<h2>Gemini 쌍둥이자리</h2>
	쌍둥이자리는 말이 많고 변화를 즐기고 정보수집과 기억력이 좋습니다.<br>
	두뇌회전이 빠른 반면 비판적이고 잔꾀를 잘 부립니다.<p/>​
	
	성장 미션으로는 자신의 관심있는 분야 생각해보기와<br>
	지식과 정보도 중요하지만 가끔은 철학적이 교리도 생각해보기가 있습니다.
</body>
</html>