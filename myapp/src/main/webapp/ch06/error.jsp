<%@page contentType="text/html; charset=UTF-8"
    isErrorPage="true"
%>
<h1>Error page</h1>
다음과 같은 예외가 발생하였습니다.<p/>
<% response.setStatus(200); %>
<%=exception.getMessage()%>