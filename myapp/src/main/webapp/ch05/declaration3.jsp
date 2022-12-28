<%@ page contentType="text/html; charset=UTF-8"%>
<h1>선언문 실습 혼자해보기</h1>
<hr/>
<%!
	int num1 = 100;
	int num2 = 50;
	public int calc() {
		return num1 - num2;
	}
%>

num1 - num2 = <%=calc()%>