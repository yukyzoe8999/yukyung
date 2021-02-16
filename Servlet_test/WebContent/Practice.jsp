<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String number = request.getParameter("s");
int num = 0;
int sum = 0;
String result;

if(number !=null && !number.equals("")) {
	num = Integer.parseInt(number);
	for(int i=1; i<=num;i++){
		sum+=i;
	}
}

if(sum%2==0) {
	   result ="짝수입니다.";
 }else{ 
	  result =  "홀수입니다.";
 } 


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="Practice.jsp">
        <div class="form-group">
             <input type="text"  name="s" maxlength="20">
	    </div>		
			 <input type="submit" value="숫자입력">						
 </form>
   <br>
   <br>
    <%=sum%>
    <%=result%>
</body>
</html>