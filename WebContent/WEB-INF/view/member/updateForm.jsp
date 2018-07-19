<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
String ctx = application.getContextPath();  //서블릿의 설정값을 가져옴


%>  
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>UPDATE_FORM</title>
	<link rel="stylesheet" href="../../css/style/css" />
</head>
<body>
<h1>비밀번호 변경</h1>
<form id = "update_Form" action="<%=ctx %>/member.do">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
새 비밀번호: <input type="text" name = "newpass" />
<input type="submit" value= "전송" />
<input type="hidden" name = "action" value = "update"/>
<input type="hidden" name = "page" value = "updateResult" />


</form>
	
</body>
</html>