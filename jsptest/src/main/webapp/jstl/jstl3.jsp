<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
html 태그 속성 url '/' 시작 === /jsptest/images/...
jsp태그 /images/... http://localhost:8081/jsptest/images/google.png
 -->
<c:url var="myimage" value="/images/google.png"/>
<c:set var="myimage2" value="/jsptest/images/android.jpg"/>
<img src="${myimage }">
<img src="${myimage2 }">
<c:url var="mypage" value="http://localhost:8081/jsptest/jstl/jstl2.jsp"/>
<c:url var="googlepage" value="http://www.google.com"/>
<!-- jsp:forward 유사(동일 서버 동일 컨텍스트 - 주소 최초 요청url) / c:redirect(주소 url 이동) -->
<%-- <c:redirect url="${googlepage }"/> --%>

<!-- jsp:include 유사(동일서버) / 다른서버 import 가능 -->
<c:import url="${mypage }">
<%-- <c:param name="num1" value=100/>  데이터보내기--%>
</c:import>
<h1>import 이후의 문장을 실행합니다.</h1>

<c:out value="${myimage2 }"/>
</body>
</html>