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
			msg = "�Ķ���";
			break;
		case "red" :
			msg = "������";
			break;
		case "orange" :
			msg = "��������";
			break;
		default : 
			color = "white";
			msg = "��Ÿ��";
	}
%>
<body bgcolor=<%=color%>>
<b><%=name%></b>���� �����ϴ� ������ <b><%=msg%></b>�Դϴ�.
</body>