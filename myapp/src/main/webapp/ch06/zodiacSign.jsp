<%@ page contentType="text/html; charset=UTF-8"%>
<%!
	String zodiacSign;
%>
<%
	String month = request.getParameter("birthdayMonth");
	int day = Integer.parseInt(request.getParameter("birthdayDay"));
%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h1>나의 별자리 알아보기</h1>
	
<%	
	if (month.equals("1월")) {
		if (day > 19) {
			zodiacSign = "Aquarius";
		} else { zodiacSign = "Capricorn"; }
	}

	if (month.equals("2월")) {
		if (day > 18) {
			zodiacSign = "Pisces";
		} else { zodiacSign = "Aquarius"; }
	}

	if (month.equals("3월")) {
		if (day > 20) {
			zodiacSign = "Aries";
		} else { zodiacSign = "Pisces"; }
	}

	if (month.equals("4월")) {
		if (day > 19) {
			zodiacSign = "Taurus";
		} else { zodiacSign = "Aries"; }
	}

	if (month.equals("5월")) {
		if (day > 20) {
			zodiacSign = "Gemini";
		} else { zodiacSign = "Taurus"; }
	}

	if (month.equals("6월")) {
		if (day > 21) {
			zodiacSign = "Cancer";
		} else { zodiacSign = "Gemini"; }
	}

	if (month.equals("7월")) {
		if (day > 22) {
			zodiacSign = "Leo";
		} else { zodiacSign = "Cancer"; }
	}

	if (month.equals("8월")) {
		if (day > 22) {
			zodiacSign = "Virgo";
		} else { zodiacSign = "Leo"; }
	}

	if (month.equals("9월")) {
		if (day > 23) {
			zodiacSign = "Libra";
		} else { zodiacSign = "Virgo"; }
	}

	if (month.equals("10월")) {
		if (day > 22) {
			zodiacSign = "Scorpio";
		} else { zodiacSign = "Libra"; }
	}

	if (month.equals("11월")) {
		if (day > 22) {
			zodiacSign = "Sagittarius";
		} else { zodiacSign = "Scorpio"; }
	}

	if (month.equals("12월")) {
		if (day > 24) {
			zodiacSign = "Capricorn";
		} else { zodiacSign = "Sagittarius"; }
	}
%>
	<jsp:forward page='<%=zodiacSign + ".jsp"%>'>
	<jsp:param name="zodiacSign" value="<%=zodiacSign%>"/>
	</jsp:forward>

</body>
</html>