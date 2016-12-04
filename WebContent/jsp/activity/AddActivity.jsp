<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add_activity" method="post">
		<label for="name">activity_name: </label>
		<input type="text" id="activity_name" name="activity_name" value="" tabindex="1">
		<label for="password">activity_time: </label>
		<input type="text" id="activity_time" name="activity_time" value="" tabindex="1">
		<label for="price">activity_price: </label>
		<input type="text" id="activity_markPrice" name="activity_markPrice" value="" tabindex="1">
		<div id="buttons">
			<input type="submit" id="submit" tabindex="5" value="Login">
		</div>
	</form>
</body>
</html>