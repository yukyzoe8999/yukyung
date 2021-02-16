<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="user.UserDao" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="user.User" scope ="page" />
<jsp:setProperty name="user" property="userID" />
<jsp:setProperty name="user" property="userPASS" />
<jsp:setProperty name="user" property="userName" />
<jsp:setProperty name="user" property="userGender" />
<jsp:setProperty name="user" property="userEmail" />


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <%
        String userID =null;
		   if(session.getAttribute("userID")!=null) {
			userID= (String)session.getAttribute("userID");
		   }
		   if(userID !=null) {
			   PrintWriter script = response.getWriter();
			   script.println("<script>");
				script.println("alert('이미 로그인 되어있습니다.')");
				script.println("location.href ='board.html'");
				script.println("</script>");	
		   }

        if(user.getUserID()==null||user.getUserPASS()==null||user.getUserName()==null||user.getUserGender()==null||user.getUserEmail()==null) {
        	PrintWriter script = response.getWriter();
        	script.println("<script>");
        	script.println("alert('입력되지 않은 필드가 있습니다.')");
        	script.println("history.back()");
        	script.println("</script>");
        } else {
        	UserDao userDao = new UserDao();
        	int result =userDao.join(user);
        	PrintWriter script = response.getWriter();
        	if(result==-1) {
        		script.println("<script>");
            	script.println("alert('이미 등록되어 있는 아이디입니다.')");
            	script.println("history.back()");
            	script.println("</script>");
        	} else {
        		session.setAttribute("userID", user.getUserID());
        		script.println("<script>");
            	script.println("alert('회원가입성공.')");
    			script.println("location.href ='board.jsp'");
            	script.println("</script>");
        	}
        }
        %>

    </body>
</html>