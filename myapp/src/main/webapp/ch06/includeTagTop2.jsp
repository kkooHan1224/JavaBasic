<%@page contentType="text/html; charset=UTF-8"%>
<%
	String siteName = request.getParameter("siteName");
%>
include ActionTag의 Top입니다.<p/>
<%=siteName%>
<hr/>