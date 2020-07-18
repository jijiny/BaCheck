<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER INFO</title>
</head>
<body>
	<c:forEach items="${map }" var="user">
		<p>회원번호 :  ${user.userNo }</p>
		<p>회원ID : ${user.userId }</p>
		<p>회원PW : ${user.userPw }</p>
		<p>회원이름 : ${user.userName }</p>
	</c:forEach>
</body>
</html>