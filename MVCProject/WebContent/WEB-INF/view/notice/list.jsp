<%@page import="com.jdbc.app.entity.Notice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="list">
		<select name="f">
			<option ${(param.f=="title")?"selected":""} value="title">제목</option>
			<option ${(param.f=="writer_id")?"selected":""} value="writer_id">글쓴이</option>
		</select> <label>검색어</label> 
		<input type="text" name="q" value="${param.q}" />
		<!-- value="${param.q}" 를 넣으면 검색어가 검색창에 남아있고 지우면 검색창에 기록이 남아있지 않음 -->
		<input type="submit" value="search" />
	</form>
	<table border=1>

		<tr>
			<td>번호</td>
			<td>제목</td>
			<!--  <td>내용</td>-->
			<td>작성자</td>
			<td>날짜</td>
			<td>조회수</td>

		</tr>
		<%--     <%List<Notice>list = (List<Notice>)request.getAttribute("list");
     for(Notice nt : list) {
    	 pageContext.setAttribute("n", nt);
     
    %>--%>
		<c:forEach var="n" items="${list}" varStatus="t">

			<tr>
				<td>${n.id}</td>
				<td><a href="detail?id=${n.id}&p=${param.p}&f=${param.f}&q=${param.q}">${n.title}</a></td>
				<!--   <td>${n.content}</td>-->
				<td>${n.write_id}</td>
				<td><fmt:formatDate pattern="yyyy.MM.dd." value="${n.regdate}"></fmt:formatDate>
				</td>
				<%-- <%} %> --%>

				<td><fmt:formatNumber type="currency" pattern="###,###"
						value="${n.hit}"></fmt:formatNumber></td>
			</tr>
		</c:forEach>
	</table>
	<!-- 변수 선언 -->
	<c:set var="page" value="${(empty param)?1:param.p}"></c:set>
	<!-- 괄호는 없어도 됨. -->
	<c:set var="startNum" value="${page-(page-1)%5}"></c:set>
	<c:set var="lastNum"
		value="${fn:substringBefore(Math.ceil(count/10),'.')}"></c:set>


	<!-- 현재 페이지 -->
	<div>
		<h3>현재페이지</h3>
		<div>
			<span>${(empty param.p)?1:param.p}</span>/${lastNum} pages
		</div>

	</div>


	<!-- 페이지 이동 -->


	<!-- prev 버튼-->
	<c:if test="${startNum > 1}">
		<a href="?p=${startNum-1}&f=${param.f}&q=${param.q}">prev</a>
	</c:if>
	<c:if test="${startNum <= 1}">
		<a href="#" onclick="alert('첫번째 페이지입니다.');">prev</a>
	</c:if>

	<ul>
		<c:forEach var="i" begin="0" end="4">
			<c:if test="${param.p == (startNum+i)}">
				<c:set var="style" value="font-weight:bold; color:red;"></c:set>
			</c:if>
			<c:if test="${param.p != (startNum+i)}">
				<c:set var="style" value=""></c:set>
			</c:if>

			<c:if test="${(startNum+i) <= lastNum}">
				<li><a style="${style}"href="?p=${startNum+i}&f=${param.f}&q=${param.q}">${startNum+i}</a>
				</li>
			</c:if>
		</c:forEach>
	</ul>

	<!-- next 다음 -->
	<c:if test="${startNum+5 <= lastNum}">
		<a href="?p=${startNum+5}&f=${param.f}&q=${param.q}">next</a>
	</c:if>
	<c:if test="${startNum+5 > lastNum}">
		<a href="#" onclick="alert('마지막 페이지입니다.');">next</a>
	</c:if>
</body>
</html>
