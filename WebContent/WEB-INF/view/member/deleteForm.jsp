<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
String ctx = application.getContextPath();  //서블릿의 설정값을 가져옴


%>  
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>DELETE_FORM</title>
	<link rel="stylesheet" href="../../css/style/css" />
</head>
<body>
<h1>회원 삭제</h1>
<form id = "delete_Form" action="<%=ctx %>/member.do">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
<input type="hidden" name = "action" value = "delete"/>
<input type="hidden" name = "page" value = "delete" />
<input type="submit" value= "전송" />


</form>
	
</body>
</html>