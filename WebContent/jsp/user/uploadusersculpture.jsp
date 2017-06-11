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
	<h1>修改用户头像</h1>
	<form action="upload_sculpture" enctype="multipart/form-data" method="post">
		<label for="file">用户头像: </label>：
		<input type="file" id="usersculpture" name="usersculpture"/>
		<div id="buttons">
			<input type="submit" id="submit" tabindex="5" value="上传">
		</div>
	</form>
</body>
</html>