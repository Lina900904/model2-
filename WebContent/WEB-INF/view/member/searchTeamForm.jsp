<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%= application.getContextPath()%>"></c:set>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>SEARCH_TEAM_FROM</title>
<jsp:include page="../common/head.jsp" />
</head>

<body>
<h1>팀명 검색</h1>



<%-- <form id = "searchTeamForm" action="${context}/member.do">
팀명 <input type="text" name = "teamid" />
<input type="submit"  value = "확인"/>
<input type="hidden" name = "action" value = "search"/>
<input type="hidden" name = "page" value = "searchTeamResult" />
	</form> --%>
	
<form name="searchTeamForm" action="${context}/member.do"
onsubmit="return searchTeamMove()" method="get">
	팀명 <input type="text" name = "teamid" />
<input type="submit"  value = "확인"/>
<input type="hidden" name = "action" value = "search"/>
<input type="hidden" name = "page" value = "searchTeamResult" />
	</form>
	
</body>
</html>