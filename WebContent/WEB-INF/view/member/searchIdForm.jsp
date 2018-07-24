<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%= application.getContextPath()%>"></c:set>
 
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>SEARCH_ID_FROM</title>
<jsp:include page="../common/head.jsp" />
</head>

<body>
<h1>아이디 검색</h1>



<%-- <form id = "searchIdForm" action="${context}/member.do">
아이디 <input type="text" name = "id" />
<input type="submit"  value = "확인"/>
<input type="hidden" name = "action" value = "retrieve"/>
<input type="hidden" name = "page" value = "searchIdResult" />
	</form>
	 --%>
	 
<form name="searchIdForm" action="${context}/member.do"
onsubmit="return searchIdMove()" method="get">
아이디 <input type="text" name = "id" />
<input type="submit"  value = "확인"/>
<input type="hidden" name = "action" value = "retrieve"/>
<input type="hidden" name = "page" value = "searchIdResult" />
</form>	
	
	
	
</body>
</html>