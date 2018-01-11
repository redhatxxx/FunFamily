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
	<script type="text/javascript" src="<c:url value="/jsfiles/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/cookieoperation.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/userfun.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/commonfun.js"/>"></script>
<title>Insert title here</title>
</head>
<body>
	<div align="right">
		<a href="javascript:void(0)" onclick="jumptohomepage()">首页</a>
		<c:if test="${sessionScope.flag!=1 }">
			<a id="usertitle" href="javascript:void(0)" onclick="jumptouserinfo()">游客</a> 
			<a id="jumplogin" href="javascript:void(0)" onclick="jumptologin()">登录</a> 
			<a id="jumpregiste" href="javascript:void(0)" onclick="jumptoregister()">注册</a> 
		</c:if>
		<c:if test="${sessionScope.flag==1 }">
			<a id="usertitle" href="javascript:void(0)" onclick="jumptouserinfo()">${sessionScope.showname }</a> 
			<a id="logout" href="javascript:void(0)" onclick="userlogout()">注销</a> 
			<c:if test="${sessionScope.managerflag==1 }">
				<a id="manager"	href="javascript:void(0)" onclick="jumpmanager()">管理员入口</a>
			</c:if>
		</c:if>
		
	</div>
	<h1>活动信息</h1>
	<p>活动名称 ： ${activity.activity_name }</p>
	<p>活动时间 : ${activity.activity_time }</p>
	<p>报名费：${activity.activity_markPrice }</p>
	<br>
	<img alt="testimg" src="../images/loginimg/enter.png">
</body>
</html>