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
<title>用户列表</title>
</head>
<body>
<div>
	<table>
		<tbody>
			<tr>
				<th>用户名</th>
				<th>用户ID</th>
				<th>#</th>
				<th>#</th>
			</tr>
			<c:forEach items="${userlist }" var="user">
				<tr>
					<td>${user.user_name }</td>
					<td>${user.user_id }</td>
					<td><a href="javascript:void(0)" onclick="#">编辑</a></td>
					<td><a href="javascript:void(0)" onclick="#">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>