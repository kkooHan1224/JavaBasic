<%@ page contentType="text/html; charset=UTF-8"%>
<%
	// response.setCharacterEncoding("gb 12052");
	// response.setStatus(404); // 404번 에러를 강제로 뜨게 만든다.
	// response.setContentType("utf-8");
	response.setHeader("Pragma", "no-cache");
	if(request.getProtocol().equals("HTTP/1.1")) {
		response.setHeader("Cache-Control", "no-store");
	}
%>
	<meta charset="UTF-8">
	<h1>Response Example1</h1>
	http://localhost/myapp/ch07/response1.jsp가<p/>
	http://localhost/myapp/ch07/response1_1.jsp로 변경이 되었습니다.<p/>
	메모장 프로그램으로 열리도록 수정해 보았습니다.
	