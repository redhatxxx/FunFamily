<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
	<!--
	用户登录
	//-->
	function isValidate(form){
		//获取信息
		username = form.username.value;
		password = form.password.value;
		alert(username+password);
		return true;
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<h3>用户登录</h3>
	<form name="loginform" action="login" method="post"
		onsubmit = "return isValidate(loginform)">
		<label>用户名：</label> <input type="text" name="username"><br>
		<label>密码：</label> <input type="text" name="password"><br>
		<input type="reset" value="重置">
		<input type="submit" value="提交"><br>
	</form>
</body>
</html>