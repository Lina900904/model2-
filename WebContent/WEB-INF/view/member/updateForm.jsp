<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%= application.getContextPath()%>"></c:set>
  
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>UPDATE_FORM</title>
<jsp:include page="../common/head.jsp" />
</head>

<body>
<h1>비밀번호 변경</h1>



<%-- <form id = "update_Form" action="${context}/member.do">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
새 비밀번호: <input type="text" name = "newpass" />
<input type="submit" value= "전송" />
<input type="hidden" name = "action" value = "update"/>
<input type="hidden" name = "page" value = "updateResult" />
</form> --%>

<form name="update_Form" action="${context}/member.do"
onsubmit="return updateMove()" method="get">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
새 비밀번호: <input type="text" name = "newpass" />
<input type="submit" value= "전송" />
<input type="hidden" name = "action" value = "update"/>
<input type="hidden" name = "page" value = "updateResult" />
</form>	
	
	
	
</body>
</html>