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
<script type="text/javascript">
function checkYN() {
	let fm = document.check; //from
	fm.action ="anotherotherTest";
	fm.method = "post"
	let yn = confirm("정말로 삭제하시겠습니까?");
	console.log(yn); //sysout
	if(yn==true) {
		fm.submit();
	} 
}
</script>
</head>
<body>
	<form action="anotherotherTest">
		<select name="f">
			<option ${(param.f == "Name")?"selected":""} value="NAME">이름</option>
		</select> <label>검색</label> <input type="text" name="q" value="${param.q}" /> <input
			type="submit" value="search" />
	</form>
	<table border=1>
	<form name="check" method="post">
		<tr>
			<!-- <td>LOCNAME</td> -->
			<td>SEQ</td>
			<td>LOCNAME</td>
			<td>날짜</td>
			<td>이름</td>
			<td>enemy</td>
			<td>내용</td>


		</tr>
		<c:forEach var="t" items="${test}" varStatus="vs">

			<tr>
				<!--<td>${t.id}</td>-->
				<td>${t.seq}</td>
				<td>${t.locname}</td>
				<td><fmt:formatDate pattern="yyyy.MM.dd." value="${t.regdate}"></fmt:formatDate></td>
				<td><a href="testdetail?seq=${t.seq}">${t.name}</a></td>
				<td>${t.enemy}</td>
				<td>${t.content}</td>
				<td><input type = "checkbox" name = "check" value = "${t.seq}"/></td>

			</tr>
		</c:forEach>
	</table>
	<input type="button" onclick="checkYN()" value="삭제" />
	</form>
	<c:set var="page" value="${(empty param)?1:param.p}"></c:set>
	<c:set var="startNum" value="${page-(page-1)%5}"></c:set>
	<c:set var="lastNum" value="${fn:substringBefore(Math.ceil(count/10),'.')}"></c:set>
	
		<div>
		<h3>현재페이지</h3>
		<div>
			<span>${(empty param.p)?1:param.p}</span>/${lastNum} pages
		</div>

	</div>

	<!-- prev 버튼-->
	<c:if test="${startNum >1}">
		<a href="?p=${startNum-1}&t=&q=">Prev</</a>

	</c:if>
	<c:if test="${startNum <=1}">
		<a href="#" onclick="alert('첫번째 페이지입니다.');">Prev</a>
	</c:if>
	<c:if test=""></c:if>

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
	<!-- next 버튼-->
	<c:if test="${startNum+5 <=lastNum}">
		<a href="?p=${startNum+5}&t=&q=">Next</</a>

	</c:if>
	<c:if test="${startNum+5 >lastNum}">
		<a href="#" onclick="alert('마지막 페이지입니다.');">Next</a>
	</c:if>


</body>
</html>