<%@page import="service.*"%>
<%@page import="domain.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JOINFORM</title>
</head>
<body>
	<script>
function moveForm(){
	return false;
	}
</script>
	

<!-- <form action="/member/user_login_form.do">
	<input type="submit" value="로그인하러가기" />
</form> -->

<form name = "move" action="/member/user_login_form.do"
onsubmit="return moveForm()" method="get">
<input type="submit" value="로그인하러가기" />
</form>
</body>
</html>