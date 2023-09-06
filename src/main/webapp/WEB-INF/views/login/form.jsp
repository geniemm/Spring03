<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
 
 <c:set var="contextPath" value="${pageContext.request.contextPath }" />
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
/*	function test(){alert("test클릭")}
	window.onload = ()=>{
		const btn = document.getElementById("btn");
		btn.addEventListener("click",test);
		// 해당하는 버튼이 클릭이되면 test를 실행하게 만드는 기능들
	}
*/
</script>
<script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/test.js"></script>
<link href="${ contextPath }/css/test.css" rel="stylesheet" />
</head>
<body>
path : ${ contextPath }
<h3>로그인 페이지</h3>
<button type="button" id="btn">클릭</button>
<button type="button" onclick="test()">클릭test</button>
	<form action="login_chk" method="post">
		<input type="text" name="id"><br>
		<input type="text" name="pwd"><br>
		<input type="submit" value="로그인"><br>
	</form>
</body>
</html>