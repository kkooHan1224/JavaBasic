<%@ page contentType="text/html; charset=UTF-8"
	session="true"
	buffer="16kb"
	autoFlush="true"
	isThreadSafe="true"
%>
<h1>Directive Example2</h1>
<%
	java.util.Date date = new java.util.Date();
%>
	현재의 날짜와 시간은?<p/>
<%=date.toLocaleString()%>