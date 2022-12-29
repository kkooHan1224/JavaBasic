<%@page contentType="text/html; charset=UTF-8"
    isErrorPage="true"
%>
<%!
	String msg1;
	String msg2;
	String msg3;
	String msg4;
%>
<%
	String name = request.getParameter("num");	
	
	if (name.matches("-?\\d+")) {
		msg1 = "정상입력";
		msg2 = "";
		msg3 = "입력내용: ";
		msg4 = "";

	} else {
		msg1 = "에러 페이지";
		msg2 = "다음과 같은 예외가 발생했습니다.";
		msg3 = "For input string: ";
		msg4 = "개발자 연락처 : 010-1234-1234";
	}
%>
<h1><%=msg1%></h1>
<%=msg2%><p/>
<%=msg3%>"<%=name%>"<br>
<%=msg4%>