<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
String ctx = application.getContextPath();  //서블릿의 설정값을 가져옴


%>  
    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>USERLOGIN</title>
	<link rel="stylesheet" href="../../css/style.css" />
</head>
<body>
<div id="user-Login-Layout"> 
	<h1 > 로그인</h1>
	<form id = "user-Login-form"action="<%=ctx %>/member.do" >
	 ID : <br><input type="text" name = "userid" /><br />
	PassWord: <br /><input type="text" name = "password"  /><br />
	<br />
	<input type="submit" value="전송" />
 <input type="hidden" name = "action" value = "login"/>
<input type="hidden" name = "page" value = "user_login_result" />


	</form>
	</div>
</body>
</html>