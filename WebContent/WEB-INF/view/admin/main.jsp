<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%=application.getContextPath()%>" />
 --%>
<!doctype html>
<html lang="en">

<jsp:include page="../common/head.jsp" />
<body>
	<div id="wrapper">
		<div id="header">
			<jsp:include page="../common/titlebox.jsp" />
			<jsp:include page="../common/loginbox.jsp" />
			</div> <!-- header end -->
			<jsp:include page="../common/admin_menubox.jsp" />
			<jsp:include page ="../common/admin_contentbox.jsp"/>
		
		</div>



	<div id="footer"></div>
	<script >
function move(domain, action, page) {
	cosole.log("테스트성공 ${context}");
	alert('테스트성공 ${context}');
	location.href="${context}/"+domain+".do?action="+action+"&page"+page;
}
</script>



	<%-- 

<h3>현재 회원수: </h3>	

	<h1>★우 주 미 녀 이 슬 화 이 팅★</h1>
	<table id="main-tab" class="width-full margin-outo height-100">
		<tr class="height-100">
			<th class="weight-full height-100" colspan="2"><img
				class="width-20 height-100  margin-outo"
				src="resources/img/home/turtle.PNG"><h1>★☆★☆★☆Turtle King★☆★☆★☆</h1>
				<img  class="main-tab layout; flot:right" src="resources/img/home/serch.PNG"></th>
	

		</tr>
		<tr class="height-500 width-60 ">

			<td id="main-tab layout" class=" height-350 width-60"><br /> 
			<img class="main-tab layout " src="resources/img/home/Main.PNG">
			<td class="height-350 width-20 margin-outo">

				<ul>
					<li><a href="${ctx}/member.do?action=move&page=joinForm">회원가입</a></li>
					<li><a href="${ctx}/member.do?action=move&page=user_login_form">사용자 로그인</a></li> 
					<li><a href="${ctx}/member.do?action=move&page=admin_login">관리자 로그인</a></li>
					 <li><a href="${ctx}/member.do?action=move&page=updateForm">비밀번호변경</a></li>
					<li><a href="${ctx}/member.do?action=move&page=deleteForm">회원탈퇴</a></li>
					<li><a href="${ctx}/member.do?action=move&page=memberList">회원목록</a></li>
					<li><a href="${ctx}/member.do?action=move&page=searchTeamForm">팀이름 검색</a></li>
					<li><a href="${ctx}/member.do?action=move&page=searchIdForm">아이디 검색</a></li> 
					
				</ul> <a class="width-full width-full margin-outo"
				href="../../html/mypage/mypage.html"> </a>
				<img class="main-tab layout " src="resources/img/home/menu.PNG">
			</td>
		</tr>

		<tr class="height-100 margin-outo">
			<td class="margin-outo" colspan="2"><img
				class="main-tab layout " src="resources/img/home/under.PNG"></td>

		</tr>
	</table>

 --%>

</body>
</html>