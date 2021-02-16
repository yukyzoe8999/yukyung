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
	<table border=1>
		<tr>
			<td>제목</td>
			<td colspan="3">${nt.title}</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td colspan="3"><fmt:formatDate pattern="yyyy.MM.dd hh:mm.ss"
					value="${nt.regdate}" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${nt.write_id}</td>
			<td>조회수</td>
			<td><fmt:formatNumber type="number" pattern="###,###"
					value="${nt.hit}"></fmt:formatNumber></td>
		</tr>
		<tr>
			<td>첨부파일</td>
			<td colspan="3"><c:forTokens var="fileName" items="${nt.files}"
					delims="," varStatus="t">
					<c:set var="style" value=""></c:set>

					<c:if test="${fn:endsWith(fileName, '.zip') }">
						<c:set var="style" value="font-weight:bold; color:red;"></c:set>
					</c:if>

					<a href="${fileName}" style="${style}">${fn:toUpperCase(fileName)}</a>
					<c:if test="${!t.last}">
          /
          </c:if>
				</c:forTokens></td>
		</tr>
		<tr>
			<td colspan="4">${nt.content}</td>
		</tr>

	</table>
	<!-- 목록버튼 -->
	필드: ${param.f}
	<br> 쿼리: ${param.q}
	<br> 페이지: ${param.p}
	<br> id : ${nt.id}
	<input type="button"
		onclick="location.href = 'list?f=${param.f}&q=${param.q}&p=${param.p}'"
		value="목록">
	<input type="button" onclick="location.href = 'detail?i=${nt.id}'"
		value="삭제">
	<br>

	<form action="detail" method="post">
		<input type="hidden" name="pageID" value="${param.id}" />
		<table border=1 bgcolor = blue>
			<tr>
				<th><input type="hidden" name="writerId" value="최유경" /> <!-- 로그인 한 사람 --></th>
				<td><input type="text" name="comment" /> <!-- comment --></td>
				<td><input type="submit" value="등록" /> <!-- date --></td>
			</tr>

		</table>
	</form>

	<c:set var="cnt" value="${count}" />
	<c:if test="${cnt == 0}">
	<h3>댓글이 없습니다.</h3>
	</c:if>
	<c:if test="${cnt != 0}">
		<table border=1>
			<c:forEach var="cl" items="${comList}" varStatus="st">
				<tr>
					<th>${cl.write_id}</th>
					<td>${cl.comment}</td>
					<td>${cl.regdate}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>