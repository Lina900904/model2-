<%@page import="domain.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>MYPAGE</title>
	
</head>
<body>

	<%
	MemberBean user = (MemberBean)request.getAttribute("user");
	%>
	<h1> <%=user.getName() %>마이페이지 진입</h1>
</body>
</html>