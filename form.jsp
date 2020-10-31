<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2> 회원 가입하기 </h2>
<form action="/MVCPractice/formController">
<table border=1 bgcolor="#FAE0D4">
	<tr>
		<td>이름</td> 
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<td>아이디</td> 
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>비밀번호</td> 
		<td><input type="text" name="pwd"></td>
	</tr>
	<tr align="center">
		<td colspan=2><input type="submit" value="가입하기"> &emsp; 
		<input type="reset" name="다시입력하기"></td>
	</tr>
</table>
</form>
</div>
</body>
</html>