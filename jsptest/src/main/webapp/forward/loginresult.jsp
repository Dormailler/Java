<%@page import="dto.MemberDTO"%>
<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>정상로그인되었습니다.</h1>
<% MemberDTO dto = (MemberDTO)request.getAttribute("member");
	if(dto !=null){
%>
<h3>회원아이디: <%=dto.getMemberid() %></h3>
<h3>회원이름: <%=dto.getName() %></h3>
<h3>회원이메일: <%=dto.getEmail() %></h3>
<h3>회원폰: <%=dto.getPhone()%></h3>
<%}else{%>
	<a href="loginform.jsp?id=member1&pw=1111">로그인하러가기</a>
	<jsp:forward page="loginform.jsp">
	<jsp:param name="id" value="member1"/>
	<jsp:param name="pw" value="1111"/>
	</jsp:forward>
	<% }%>
</body>
</html>