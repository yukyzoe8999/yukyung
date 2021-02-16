<%@page import="com.score.entity.score"%>
<%@page import="java.util.List"%>
<%@page import="com.score.service.scoreService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<select name="s">
			<option value="location">지역</option>
			<option value="name">이름</option>
		</select>
		<lable>검색어</lable>
		<input type="text" name="q" value=""> <input type="submit"
			value="search">
	</form>
	<table border=1>
		<tr>
			<td>지역</td>
			<td>이름</td>
			<td>날짜</td>
			<td>상대</td>
		</tr>
		<%List<score> list = (List<score>)request.getAttribute("slist");
		
		for(score s: list) {
		pageContext.setAttribute("sl", s);%>

		<tr>
			<td>${sl.location}</td>
			<td>${sl.name}</td>
			<td>${sl.date}</td>
			<td>${sl.enemy}</td>
		</tr>
		<% } %>

	</table>

</body>
</html>