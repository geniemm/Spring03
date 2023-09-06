<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>get방식</h2>
	<form action="result" method="get"> <%-- result:상대경로 > 마지막 index부분만 변경한다 --%>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="get전송"><br>
	</form>
	
	<h2>post방식</h2>
	<form action="/root/my/result" method="post">	<%-- /result:절대경로 > 포트번호 다음부터 다 쓰는거 --%>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="post전송"><br>
	</form>
	
	<h3>dto방식</h3>
	<form action="dto" method="post">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="text" name="addr"><br>
		<input type="submit" value="dto전송"><br>
	</form>
	
	
</body>
</html>