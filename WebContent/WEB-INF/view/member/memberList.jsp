<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import ="java.util.*" %>
<%@ page import ="domain.*" %>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>MEMBER_LIST</title>
<jsp:include page="../common/head.jsp" />
</head>
<body>



리스트용
	<%-- 	
		<tr>
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>직책</td>
			<td>생년월일</td>
			<td>팀아이디</td>
		</tr>	
		<%
	List<MemberBean> lst = MemberServiceImpl.getInstance().memberList();
	for(int i =0; i<lst.size(); i++){		
	%>
		<tr class = "height 100">
			<td><h3><%= lst.get(i).getId()%></h3></td>
			<td><h3><%= lst.get(i).getName()%></h3>	</td>			
			<td><h3><%= lst.get(i).getPassword()%></h3></td>
			<td><h3><%= lst.get(i).getRoll()%></h3></td>
			<td><h3><%= lst.get(i).getSsn()%></h3></td>
			<td><h3><%= lst.get(i).getTeamId()%></h3></td>
		</tr>
		
			<%}	%>
	</table>
	<input type="hidden" name = "action" value = "memberlist" />
	
	 --%>
</body>
</html>
