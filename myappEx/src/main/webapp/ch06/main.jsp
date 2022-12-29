<%@ page info="저작권자 : 서정한" contentType="text/html; charset=UTF-8" errorPage="inputOk.jsp"%>
<%@ include file="top.jsp"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=chrome">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>If-else Example</title>
</head>
<h1>혼자 해보기</h1>
<b>JSP 지시자 실습 - page, include, error page</b><p/>
<b>- Top의 시간과 Bottom의 저작권 페이지는 include로 완성</b><p/>
<b>- Top 페이지의 시간과 저작권 표시는 page 속성으로 완성</b><p/>
<b>- Main에서 오류 발생시 errorPage와 isErrorPage 속성으로 완성</b><p/>
<b>- 파일 총 4개(main.jsp, top.jsp, bottom.jsp)</b><p/>
<form method="post" action="inputOk.jsp">
정수 입력: <input name="num"> <input type="submit" value="확인">
</form>

<%@ include file="bottom.jsp"%>