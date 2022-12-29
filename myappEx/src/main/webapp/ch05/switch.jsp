<%@ page contentType="text/html; charset=EUC-KR"%>
<h1>Switch Example</h1>
<%!
	String msg;
%>
<%
	String name = request.getParameter("name");
	String color = request.getParameter("color");
	
	
	switch (color) {
		case "blue" :
			msg = "파란색";
			break;
		case "red" :
			msg = "붉은색";
			break;
		case "orange" :
			msg = "오렌지색";
			break;
		default : 
			color = "white";
			msg = "기타색";
	}
%>
<body bgcolor=<%=color%>>
<b><%=name%></b>님이 좋아하는 색깔은 <b><%=msg%></b>입니다.
</body>