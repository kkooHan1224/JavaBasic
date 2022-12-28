<%@ page contentType="text/html; charset=UTF-8"%>
<h3>선언문,스크립트릿,표현식,주석문 사용 예제</h3>
<%-- 멤버변수 선언 --%>
<%!
	int n1;
	int n2;
	public int multiple(int a, int b) { return a+b; }
%>
<%-- 스크립트릿을 통한 값 대입 --%>
<%
	n1 = 10;
	n2 = 20;
%>

<%-- 결과 출력 --%>
표현식 이용 출력: <%=multiple(n1, n2)%> <br>
<%-- 스크립트릿을 이용한 출력을 할 때는 자바문법을 떠올려라. --%>
스크립트릿 이용 출력: <%	out.println(multiple(n1, n2));%>