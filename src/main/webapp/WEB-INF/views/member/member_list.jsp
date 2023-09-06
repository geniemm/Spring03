<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>멤버 리스트</h5>
<table border="1">
	<tr>
		<th>아이디</th><th>비밀번호</th><th>이름</th>
	</tr>
	<c:forEach var="i" items="${list}">
	<tr>
		<td>${i.id }</td><td>${i.pwd}</td><td><a href="member_info?id=${i.id}">${i.name}</a></td>
	</tr>	
	</c:forEach>	
	<tr>
		<td colspan="3"><a href="main">index이동</a></td>
	</tr>
</table>
</body>
</html>