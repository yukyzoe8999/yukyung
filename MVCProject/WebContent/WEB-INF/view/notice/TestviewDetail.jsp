<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1>
   <tr>
      <td> 
          ${test.locname}
      </td>
   </tr>
      <tr>
      <td> 
         <fmt:formatDate pattern ="yyyy.MM.dd. hh.mm.ss" value ="${test.regdate}"></fmt:formatDate>
      </td>
   </tr>
      <tr>
      <td> 
          ${test.name}
      </td>
   </tr>
      <tr>
      <td> 
          ${test.enemy}
      </td>
   </tr>
      <tr>
      <td> 
          ${test.content}
      </td>
   </tr>
</table>

</body>
</html>