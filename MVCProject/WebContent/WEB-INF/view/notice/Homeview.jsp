<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
    <tr>
      <td>이름
      </td>    
      <td>${userlist.name}
      </td>
    </tr>
       <tr>
      <td>등록일
      </td>    
      <td>${userlist.regdate}
      </td>
    </tr>
       <tr>
      <td>이메일
      </td>    
      <td>${userlist.email}
      </td>
    </tr>
</table>
</body>
</html>