<%@page import="com.jdbc.app.entity.Temp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <table border=1>
    <tr>
     <td>날짜</td>
     <td>온도</td>
     <td>작성자</td>
    </tr>

     <%List<Temp>list = (List<Temp>)request.getAttribute("listtemp");
     for(Temp tm : list) {
    	 pageContext.setAttribute("t", tm);
     
    %>
       <tr>
         <td><a href = "tempregion?date=${t.date}">${t.date}</a></td>
         <td>${t.temp}</td>
         <td>${t.writer}</td>
      </tr>
         <%} %>
    
      </table>   
</body>
</html>