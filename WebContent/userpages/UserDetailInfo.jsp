<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../jsfiles/tmpfunjs.js">
</script>
</head>
<body>
	<form name="userinfoform" action="edituserinfo" id = "userinfo" method="post">
		<table>
			<tr>
				<td><label>用户名：</label></td>
				<td><input type="text" id="username" readonly="readonly" value="tmp"></td>
				<td><input type="button" id="btnusername" value="..."></td>
			</tr>
			<tr>
				<td><label>验证邮箱：</label></td>
				<td><input type="text" id="useremail" readonly="readonly" value="dasdf@ds.com"></td>
				<td><input type="button" id="btnuseremail" value="..."></td>
			</tr>
			<tr>
				<td><label>地区：</label></td>
				<td><select id="province" onchange="changecity()">
					<option value="1" selected>辽宁</option>
					<option value="2">陕西</option>
					<option value="3">山东</option>
				</select>
				<select id="city_op">
					<option value="11" selceted>沈阳</option>
					<option value="12">大连</option>
					<option value="13">鞍山</option>
				</select>
				</td>
				<td></td>
			</tr>
		</table>
		<br>测试信息:
		<c:out value=" XXXXXXXXX">
		</c:out>
		<br>el基本语法：
		<h1> ${"welcome EL language!"}</h1>
		<br>
		用户名： ${param.username}
	</form>
</body>
</html>