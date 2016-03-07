<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jsfiles/checkinfo.js">
	
</script>
</head>
<body>
	<form name="registerform" id="rf" action="register" method="post">
			<table align="center">
				<tr>
					<td><label>用户名：</label></td>
					<td><input type="text" name="username"></td>
					<td><label id="userwarn">*</label></td>
				</tr>
				<tr>
					<td><label>密码：</label></td>
					<td><input type="text" name="userpassword"></td>
					<td><label>*</label></td>
				</tr>
				<tr>
					<td><label>重复密码：</label></td>
					<td><input type="text" name="repassword"></td>
					<td><label>*</label></td>
				</tr>
				<tr>
					<td><label>邮箱 ：</label></td>
					<td><input type="text" name="email"></td>
					<td><label>*</label></td>
				</tr>
				<tr>
					<td><label>兴趣</label></td>
					<td><input type="checkbox" name="like" value="1" checked>运动
						<input type="checkbox" name="like" value="2" checked>读书
						<input type="checkbox" name="like" value="3" checked>听音乐
					</td>
				</tr>
				<tr>
					<td><label>地区</label></td>
					<td><select name="area">
						<option value="en">华北</option>
						<option value="es">华南</option>
						<option value="wn" selected>西北</option>
						<option value="ws">西南</option>
						<option value="ec">华中</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><label>性别:</label></td>
					<td><input type="radio" name="sex" value="man" checked>男
						<input type="radio" name="sex" value="woman">女</td>
				</tr>
				<tr>
					<td align="right"><input type="reset" value="重置"></td>
					<td align="center"><input type="button" onclick="isValidate()" value="提交"></td>
				</tr>
			</table>
	</form>
</body>
</html>