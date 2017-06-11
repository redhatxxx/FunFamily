<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<script type="text/javascript" src="<c:url value="/jsfiles/jquery-3.1.1.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/cookieoperation.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/jsfiles/userfun.js"/>"></script>
	<script>
		window.onload = function(){
			var uuid = document.getElementById("uu_id").value;
			if(uuid!=null&&uuid!=""){
				var cookievalue = getCookie("fun_u_uuid");
				if(cookievalue!=null)
					addcookie("fun_u_uuid",uuid,0);
			}
		}
		</script>
</head>
<body>
	<div name="hiddenarea">
		<input type="hidden" id="uu_id" name="uu_id" value="${sessionScope.user_id }"> 
	</div>
	<div align="right">
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
	<div align="center">
		<img src="" /> <a href="javascript:void(0)" onclick="">首页</a> <a
			href="javascript:void(0)" onclick="">精彩活动</a> <a
			href="javascript:void(0)" onclick="">昨日回忆</a> <a
			href="javascript:void(0)" onclick="">我们的团队</a> <a
			href="javascript:void(0)" onclick="">加入我们</a>
	</div>
	<div align="center">
		<table boder="1">
			<tbody>
				<tr>
					<th>活动名</th>
					<th>活动时间</th>
					<th>活动价格</th>
				</tr>
				<c:forEach items="${activs }" var="active">
					<tr>
						<td><a href="/FunFamily/activity_view/${active.activity_id}"
							onclick="">${active.activity_name }</a></td>
						<td>${active.activity_time }</td>
						<td>${active.activity_markPrice }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>