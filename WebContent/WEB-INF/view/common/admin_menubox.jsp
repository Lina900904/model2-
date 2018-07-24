<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="<%=application.getContextPath()%>" /> --%>

	<div id= "menu-box">
		<ul id = "menu">
			<li><a href="${context}/common.do">HOME</a></li>
			<li><a href="${context}/member.do?action=move&page=memberList">회원목록</a></li>
			<li><a href="${context}/member.do?action=move&page=searchTeamForm">팀이름 검색</a></li>
			<li><a href="${context}/member.do?action=move&page=searchIdForm">아이디 검색</a></li> 
						
			
		</ul>
		</div>