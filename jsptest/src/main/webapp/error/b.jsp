<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="e.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setAttribute("file", request.getRequestURI()); //오류발생전에있어야함
request.setAttribute("errormsg", "0-3사이의 값만 허용");%>
<% String[] menus= {"1","2","3","4"};
int index = Integer.parseInt(request.getParameter("menu"));%>
<h1>선택한 메뉴=<%=menus[index] %></h1>

</body>
</html>