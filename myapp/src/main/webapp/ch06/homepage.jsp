<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String language = request.getParameter("language");
	if (language.equals("한국어")) {
%>
	<jsp:include page="includeKorean.jsp"/>
<%
	} else {
%>
	<jsp:include page="includeEnglish.jsp"/>
<%
	}
%>