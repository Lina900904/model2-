<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%= application.getContextPath()%>"></c:set>
  
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>DELETE_FORM</title>
<jsp:include page="../common/head.jsp" />
</head>

<body>


<h1>회원 삭제</h1>
<%-- <form id = "delete_Form" action="${context}/member.do">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
<input type="hidden" name = "action" value = "delete"/>
<input type="hidden" name = "page" value = "delete" />
<input type="submit" value= "전송" />
</form>
	 --%>
<form name = "deleteForm" action="${context}/member.do"
onsubmit="return deleteMove()">
아이디: <input type="text" name = "id" />
비밀번호:<input type="text" name = "pass" />
<input type="hidden" name = "action" value = "delete"/>
<input type="hidden" name = "page" value = "delete" />
<input type="submit" value= "전송" />
</form>


	
	
	
	
</body>
</html>