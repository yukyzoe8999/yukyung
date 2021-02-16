<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%=request.getAttribute("bow") %>
    ${bow} <!-- EL code(tag) -->
    ${member[0]}
    ${member[1]}
    ${member[2]}
    
    ${map.id<3} <!-- false 값 출력 -->
    ${map.title}
    ${map.number>4} <!-- true 값 출력 -->
    ${empty list[2]?'값이 없습니다.' :list[2]} <!-- 값이 있으면 찍고 없으면 '값이 없습니다'를 찍는다. use 0 instead of '값이 없습니다' -->
    <!-- ${list[2]==null || list[2] ==' '} -->  
</body>
</html>