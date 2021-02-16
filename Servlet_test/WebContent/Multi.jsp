<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String number = request.getParameter("n");
   int num=0;
   int mul=0;
   if(number !=null && !number.equals("")) {
		num = Integer.parseInt(number);
	 for(int i=1;i<=9;i++) {
		   mul = i*num;
	   }
   }  
   %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=mul%>

</body>
</html>
