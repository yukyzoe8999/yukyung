<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>공지사항 등록</h2>
	<form method="post" action="write">
		<table border=1>
			<tr>
				<td>ENEMY</td>
				<td colspan="3"><input type="text" name="ENEMY"></td>
			</tr>
			<tr>
				<td>HITER</td>
				<td colspan="3"><input type="text" name="HITER"></td>
			</tr>
			<tr>
				<td colspan="4"><textarea name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="4"><input type="checkbox" name="handout" value = "true">
				<label for = "handout">공개</label></td>
			</tr>
		</table>
		<input type = "submit" value = "등록">
		<a href = "anotherfile">취소</a>
	</form>

</body>
</html>