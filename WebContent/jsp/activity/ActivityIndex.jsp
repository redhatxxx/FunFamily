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
<script type="text/javascript" src="<c:url value="/jsfiles/userfun.js"/>"></script>
<script type="text/javascript" src="<c:url value="/jsfiles/jquery-3.1.1.min.js"/>"></script>
<title>活动列表</title>
</head>
<body>
<h1>活动列表</h1>
<div>
	<table>
		<tbody>
			<tr>
				<th>活动名</th>
				<th>活动时间</th>
				<th>活动价格</th>
				<th>#</th>
				<th>#</th>
			</tr>
			<c:forEach items="${activs }" var="active">
				<tr>
					<td>${active.activity_name }</td>
					<td>${active.activity_time }</td>
					<td>${active.activity_markPrice }</td>
					<td><a href="/FunFamily/activity_view/${active.activity_id}" onclick="">编辑</a></td>
					<td><a href="javascript:void(0)" onclick="deleteactivity('${active.activity_id }')">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>