<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="contents.ContentDao" %>
<%@page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="contents" class="contents.Contents" scope ="page" />
<jsp:setProperty name="contents" property="title" />
<jsp:setProperty name="contents" property="content" />



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
	//로그인 한 사람만 글 쓰기 가능
	 if(userID ==null) {
			   PrintWriter script = response.getWriter();
			   script.println("<script>");
			   script.println("alert('로그인 한 사람만 글을 쓰실 수 있습니다.')");
			   script.println("location.href ='Login.jsp'");
			   script.println("</script>");	
		   } else {
			   if(contents.getTitle()==null||contents.getContent()==null) { //비정상적으로 글쓰기 완료
				   PrintWriter script = response.getWriter();
				   script.println("<script>");
				   script.println("alert('제목 또는 내용이입력되지 않았습니다.')");
				   script.println("history.back()'");
				   script.println("</script>");	
				   
			   } else { //정상적으로 글쓰기 완료
				   ContentDao cd = new ContentDao();
			       int result = cd.write(contents.getTitle(), userID, contents.getContent());
				   if(result == -1) { //DB오류
					   PrintWriter script = response.getWriter();
					   script.println("<script>");
					   script.println("alert('글쓰기에 실패하셨습니다.')");
					   script.println("history.back()'");
					   script.println("</script>");	
				   } else {
					   PrintWriter script = response.getWriter();
					   script.println("<script>");
					   script.println("alert('글쓰기 성공.')");
					   script.println("location.href ='board.jsp'");
					   script.println("</script>");	
				   }
			   }
		   }
	
	%> 

    

</body>
</html>

