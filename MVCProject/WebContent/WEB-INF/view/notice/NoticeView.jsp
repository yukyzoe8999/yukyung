<%@page import="com.jdbc.app.entity.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
    <%List<Notice>detail = (List<Notice>)request.getAttribute("detail");
     for(Notice de : detail) {
    	 pageContext.setAttribute("d", de);  
    %>
         <tr>
          <td>${d.title}</td>
          <td>${d.write_id}</td>
          <td>${d.content}</td>
          <%} %>
          
         </tr>
    </table>
</body>
</html>