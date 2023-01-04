<%@page contentType="text/html; charset=UTF-8"
    isErrorPage="true"
%>
<%
	String message = exception.getMessage();
	String objectMessage = exception.toString();
%>

<%
if (message.contains("input")) {
%>
<h1>숫자 입력 에러!</h1>
<h3>숫자는 정수만 입력하세요.</h3>
<%	
}
%>
<%
if (message.contains("zero")) {
%>
<h1>나눗셈 에러!</h1>
<h3>0으로 나눌 수 없습니다.</h3>
<%	
}
%>