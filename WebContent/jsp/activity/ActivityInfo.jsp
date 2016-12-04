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
	<h1>活动信息</h1>
	<p>活动名称 ： ${activity.activity_name }</p>
	<p>活动时间 : ${activity.activity_time }</p>
	<p>报名费：${activity.activity_markPrice }</p>
	<br>
	<img alt="testimg" src="../images/loginimg/enter.png">
</body>
</html>