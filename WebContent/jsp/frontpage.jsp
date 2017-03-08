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
			var username = getCookie("username");
				if(username!=""&&username!="null"){
					document.getElementById("usertitle").innerHTML=username;
					//visibility不显示但占用位置会有空白
					//document.getElementById("jumplogin").style.visibility="hidden";
					document.getElementById("jumplogin").style.display="none";
				}
				else{
					document.getElementById("usertitle").innerHTML="游客";
					//document.getElementById("logout").style.visibility="hidden";
					document.getElementById("logout").style.display="none";
				}
				document.getElementById("manager").style.display="none";
		}
		</script>
</head>
<body>
	<div align="right">
		<label id="usertitle"></label> <a id="logout"
			href="javascript:void(0)" onclick="logoutdeletecookie()">注销</a> <a id="jumplogin"
			href="javascript:void(0)" onclick="jumptologin()">登录</a> <a id="manager"
			href="javascript:void(0)" onclick="jumpmanager()">管理员入口</a>
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