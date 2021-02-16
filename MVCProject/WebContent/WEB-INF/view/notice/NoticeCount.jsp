<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.jdbc.app.entity.Notice"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table border=1>
     <%List<Notice>list = (List<Notice>)request.getAttribute("count");
     for(Notice nt : list) {
    	 pageContext.setAttribute("c", nt);
     
    %>
       <tr>
         <td>count ${c.count(ID)}</td>
      </tr>
         <%} %>
    
      </table>   
</body>
</html>