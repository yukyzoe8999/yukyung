<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String number = request.getParameter("s");
String mail = request.getParameter("m");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="Practice_2.jsp">
        <div class="form-group">
             <input type="text"  name="s" maxlength="20">
	    </div>	
             <input type="email"  name="m" maxlength="20">
	    </div>		
			 <input type="submit" value="숫자입력">						
 </form>
   <br>
   <br>
    <%=number%>
    <%=mail%>
    

</body>
</html>