<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Board</title>
</head>
<body>
    <%
      session.invalidate();
    %>
    <script>
      alert('Log out 되었습니다.');
      location.href = "Login.jsp";
    </script>
</body>
</html>