<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	@import url("<c:url value="/css/basestyle.css"/>");
</style>
<title>Insert title here</title>
</head>
<body>
	<form action="user_login" method="post">
		<label for="name">Name: </label>
		<input type="text" id="user_name" name="user_name" value="" tabindex="1">
		<label for="password">PassWord: </label>
		<input type="text" id="user_password" name="user_password" value="" tabindex="1">
		<div id="buttons">
			<input type="submit" id="submit" tabindex="5" value="Login">
		</div>
	</form>
</body>
</html>