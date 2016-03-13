<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>请求头信息： ${header["accept-language"]}
	<br>请求信息：
	<c:out value=" ${param.para}">
	</c:out>
	<br>状态信息:
	<c:out value=" ${requestScope.status}"></c:out>
	<br>session中的 一般信息：
	<br>
	<c:out value=" ${sessionScope.sessioninfo}"></c:out>
	<c:choose>
		<c:when test=" ${!(empty sessionScope.user)}">
			${"欢迎光临！"}
		</c:when>
		<c:otherwise>
			${"游客！"}
		</c:otherwise>
	</c:choose>
	<br>
	<c:forEach var="i" begin="1" end="9" step="3">
		${i}<br>
	</c:forEach>
	<br>
	<table>
		<thead align="center">
			<tr>
				<th>用户名</th>
				<th>邮箱</th>
			</tr>
		</thead>
		<tbody align="left">
			<c:forEach var="user" items=" ${users}">
				<tr><td> ${user.user_name}</td>
				<td> ${user.email}</td></tr>
			</c:forEach>
		</tbody>
	</table>
	<br>
	<c:if test=" ${fn:contains( ${sessionScope.strinfo},"bcd") }">
		匹配成功！
	</c:if>
	<br>
	<c:if test=" ${fn:endsWith( ${sessionScope.filename},".txt") }">
		文本文档
	</c:if>
	<br>用户名：
	${param.username}
</body>
</html>