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
	<h1>编辑用户信息</h1>
	<form action="save_userinfo" enctype="multipart/form-data" method="post">
		<input type="hidden" id="user_id" name="user_id" value="${userinfo.user_id }">
		<label for="name">Name: </label>
		<input type="text" id="user_name" name="user_name" value="${userinfo.user_name }" tabindex="1">
		<label for="password">PassWord: </label>
		<input type="text" id="user_password" name="user_password" value="${userinfo.user_password }" tabindex="1">
		<label for="password">RePassWord: </label>
		<input type="text" id="user_repassword" name="user_repassword" value="${userinfo.user_repassword }" tabindex="1">
		<label for="file">用户头像: </label>：
		<input type="file" id="usersculpture" name="usersculpture"/>
		<div id="buttons">
			<input type="submit" id="submit" tabindex="5" value="上传">
		</div>
	</form>
</body>
</html>