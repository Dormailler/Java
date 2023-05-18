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
<%
String id = request.getParameter("id");
int pw = Integer.parseInt(request.getParameter("pw"));
MemberDAO dao = new MemberDAO();
MemberDTO dto = dao.getMember(id, pw);
%>
<h1>수정폼</h1>
<form action="updateresult.jsp">
아이디(수정불가) <input type = text name= "memberid" value="${param.id }" readonly><br>
암호(수정불가) <input type = password name= "pw" value="${param.pw }" readonly><br>
이름 <input type = text name= "name" value="<%=dto.getName()%>"><br>
이메일 <input type = email name= "email" value="<%=dto.getEmail()%>"><br>
폰번호 <input type = tel name= "phone" value="<%=dto.getPhone()%>"><br>
<input type=submit value="수정">
</form>
</body>
</html>