<%@ page contentType="text/html; charset=UTF-8" 
	errorPage="../ch08/calc2error.jsp"%>
<jsp:useBean id="calc" class="ch09.CalcBean" />
<jsp:setProperty name="calc" property="*" />
<% if (request.getMethod().equals("POST")) calc.calculate(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈즈 계산기</title>
</head>
<body>
	<h1>자바빈즈 계산기</h1>
	<hr/>
	<form method="post">
		<input name="num1">
		<select name="op">
			<option value="">선택</option>
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<input name="num2">
		<input type="submit" value="계산">
		<input type="reset" value="다시입력"><br/>
		<h3>계산결과 : <jsp:getProperty name="calc" property="result" /></h3>
	</form>
</body>
</html>