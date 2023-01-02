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
	
	<h2>Taurus 황소자리</h2>
	황소자리는 오감이 매우 발달했고, 심사숙고하고 인내심이 강합니다.<br>
	꼼꼼하고 평화적, 안정적, 차분하지만 말수가 적고 고집이 강한 편입니다.<p/>

	성장 미션으로는 새로운 사람, 새로운 성장에 있어 마음에 문을 열고 유연성 발휘하기,<br>
	집착하는 마음이 생길 때 나눔의 시간 갖기가 있습니다.
</body>
</html>