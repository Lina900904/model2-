<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
String ctx = application.getContextPath();  //서블릿의 설정값을 가져옴


%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>SEARCH_TEAM_FROM</title>
	<link rel="stylesheet" href="../../css/style.css" />
</head>
<body>
<h1>팀명 검색</h1>
<form id = "searchTeamForm" action="<%=ctx %>/member.do">
팀명 <input type="text" name = "teamid" />
<input type="submit"  value = "확인"/>
<input type="hidden" name = "action" value = "search"/>
<input type="hidden" name = "page" value = "searchTeamResult" />
	</form>
</body>
</html>