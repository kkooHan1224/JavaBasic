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
	
	<h2>Aquarius 물병자리</h2>
	물병자리들은 기존의 틀이나 습관에서 벗어나고자 하는 성향이 강합니다.<br>
	수평적 관계를 좋아하고 특정단어에 민감한 편입니다.<p/> 

	성장 미션으로는 자신과 다른 대화 스타일을 가진 사람과 이야기해보기와<br>
	소통을 나눌수 있는 친구 만나기가 있습니다.
</body>
</html>