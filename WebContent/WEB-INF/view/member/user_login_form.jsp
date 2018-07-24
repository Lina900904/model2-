<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%= application.getContextPath()%>"></c:set>
<%-- 
<% 
String ctx = application.getContextPath();  //서블릿의 설정값을 가져옴
%> --%>  
    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>USERLOGIN</title>
<jsp:include page="../common/head.jsp" />
</head>

<body>

<div id="user-Login-Layout"> 
	<h1 > 로그인</h1>
<%-- 	
	<form id = "user-Login-form"action="${context}/member.do" >
	 ID : <br><input type="text" name = "userid" /><br />
	PassWord: <br /><input type="text" name = "password"  /><br />
	<br />
	<input type="submit" value="전송" />
 <input type="hidden" name = "action" value = "login"/>
<input type="hidden" name = "page" value = "mypage" />


	</form> --%>
	</div>

<form name="user-Login-form" action="${context}/member.do"
onsubmit="return loginMove()" >
 ID : <br><input type="text" name = "userid" /><br />
PassWord: <br /><input type="text" name = "password"  /><br />
<br />
	<input type="submit" value="전송" />
 <input type="hidden" name = "action" value = "login"/>
<input type="hidden" name = "page" value = "mypage" />

</form>
	

	
</body>
</html>