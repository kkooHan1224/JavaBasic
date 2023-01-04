<%@ page contentType="text/html; charset=UTF-8" 
	errorPage="calc2error.jsp"%>

<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	String operator = request.getParameter("operator");
	int	num2 = Integer.parseInt(request.getParameter("num2"));
	int result = 0;
	
	switch (operator) {
	case "+":
		result = num1 + num2;
		break;
	case "-":
		result = num1 - num2;
		break;
	case "*":
		result = num1 * num2;
		break;
	case "/":
		result = num1 / num2;
		break;
	}
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP 계산기</title>
</head>
<body>
	<h1>JSP 계산기</h1>
	<hr/>
	계산결과 : <%=num1%><%=operator%><%=num2%> = <b>'<%=result%>'</b>
</body>
</html>