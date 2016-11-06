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
	<h1>用户信息</h1>
	${userinfo.user_name }

	<label>用户头像: </label><br/>
	<img width="100" src="<c:url value="/images/"/>${userinfo.sculptrue_path }" />
</body>
</html>