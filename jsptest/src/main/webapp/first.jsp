<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 속성 기본값 생략. 다른 속성 우선시 pageEncoding=utf-8 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 주석처리 클래스에서 안보임 
<%! //전역변수 
String testvar = "테스트용 변수입니다"; 
%>
<%!
String test(){
	return testvar;
}
%>
<%=test() %>
--%>
<%

// _jspService 메소드 자동 생성 - 지역변수 선언
 String id = request.getParameter("id");
 Date now = new Date();
%>
<h1><%=id %> 회원님 <%=now %> 시각에 로그인하셨습니다.</h1>
<%="java" %><br>
<% out.println("java"); %><br>
 
<input type=text name="id" value="<%=id%>">
<!-- 
<button>전송</button>
-->
</body>
</html>