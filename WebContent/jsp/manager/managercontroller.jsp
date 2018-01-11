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
	<title>首页</title>
	<script type="text/javascript" src="<c:url value="/jsfiles/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/cookieoperation.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/userfun.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/commonfun.js"/>"></script>
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
	<ul>
		<li><a href="javascript:void(0)" onclick="reloadbyparam(1)">团队列表</a></li>
			<c:if test="${showgroup==1 }">
				<table>
					<tr>
						<th>团队名称</th>
						<th>领队</th>
						<th>创建时间</th>
					</tr>
					<c:forEach items="${grouplist }" var="group">
						<tr>
							<td>${group.group_name }</td>
							<td>${group.group_leader.user_name }</td>
							<td>${group.group_create_time }</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
		<li><a href="javascript:void(0)" onclick="reloadbyparam(2)">用户列表</a></li>
			<c:if test="${showuser==1 }">
				<table>
					<tr>
						<th>用户名</th>
						<th>邮箱</th>
						<th>创建时间</th>
					</tr>
					<c:forEach items="${userlist }" var="user">
						<tr>
							<td>${user.user_name }</td>
							<td>${user.user_email }</td>
							<td>${user.user_regist_time }</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
		<li><a href="javascript:void(0)" onclick="reloadbyparam(3)">活动列表</a></li>
			<c:if test="${showactiv==1 }">
				<table>
					<tr>
						<th>活动名称</th>
						<th>活动时间</th>
						<th>价格</th>
					</tr>
					<c:forEach items="${activlist }" var="activ">
						<tr>
							<td>${activ.activity_name }</td>
							<td>${activ.activity_time }</td>
							<td>${activ.activity_markPrice }</td>
						</tr>
					</c:forEach>
				</table>
			</c:if>
	</ul>
</body>
</html>