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
	<br>
	<h1>编辑用户信息</h1>
	<form action="save_userinfo"  method="post">
		<input type="hidden" id="user_id" name="user_id" value="${userinfo.user_id }">
		<br>
		<label for="name">用户名: </label>
		<input type="text" id="user_name" name="user_name" value="${userinfo.user_name }" tabindex="1">
		<br>
		<label for="user_email">邮箱: </label>
		<input type="text" id="user_email" name="user_email" value="${userinfo.user_email }" tabindex="1">
		<br>
		<label for="user_sex">性别: </label>
		<c:if test="${userinfo.user_sex==1 }">
			<label><input id="user_sex" name="user_sex" type="radio" value="1" checked="checked"/>男 </label>
			<label><input id="user_sex" name="user_sex" type="radio" value="0" />女 </label>
		</c:if>
		<c:if test="${userinfo.user_sex==0 }">
			<label><input id="user_sex" name="user_sex" type="radio" value="1" />男 </label>
			<label><input id="user_sex" name="user_sex" type="radio" value="0" checked="checked"/>女 </label>
		</c:if>
		<br>
		<label for="user_nickname">昵称: </label>
		<input type="text" id="user_nickname" name="user_nickname" value="${userinfo.user_nickname }" tabindex="1">
		<br>
		<label for="user_qq_number">qq号码: </label>
		<input type="text" id="user_qq_number" name="user_qq_number" value="${userinfo.user_qq_number }" tabindex="1">
		<br>
		<label for="user_weixin_account">微信账号: </label>
		<input type="text" id="user_weixin_account" name="user_weixin_account" value="${userinfo.user_weixin_account }" tabindex="1">
		<br>
		<label>用户头像: </label><br/>
		<a href="javascript:void(0)" onclick="jumptoeidtpic()"><img width="100" src="<c:url value="/images/"/>${userinfo.sculptrue_path }"/></a>
		<div id="buttons">
			<input type="submit" id="submit" tabindex="5" value="保存">
		</div>
	</form>
</body>
</html>