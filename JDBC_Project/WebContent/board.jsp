<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.io.PrintWriter" %>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "contents.ContentDao" %>
    <%@ page import = "contents.Contents" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content=width=divice-width ", initial-scale="1">
      <link rel="stylesheet" href="css/bootstrap.css">
      <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
      <script src="js/bootstrap.js"></script>
      <title>JSP Board</title>
   </head>
   <body>
      <%
      String userID = null;
      if(session.getAttribute("userID")!=null){
         userID=(String)session.getAttribute("userID");
      }
      
      int pageNumber = 1;
      
      if(request.getParameter("pageNumber")!=null){
         pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
      }
      %>
      <nav class="navbar navbar-default">
         <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                  data-togle="collapse" data-target = "#bs-example-navbar-collapse-1"
                  aria-expanded="false">
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="main.jsp">JSP Board</a>                
         </div>
         <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
               <li><a href="main.jsp">메인</a></li>
               <li><a href="board.jsp">게시판</a></li>      
            </ul>
            <%
               if(userID == null){
                  
               
            %>
            <ul class="nav navbar-nav navbar-right">
               <li class="dropdown">
                  <a href="#" class="dropdown-toggle"
                  data-toggle="dropdown" role="button" aria-haspopup = "true"
                  aria-expanded="false">접속하기<span class="caret"></span></a>
                  <ul class ="dropdown-menu">
                     <li class="active">
                        <a href="Login.jsp">Login</a>
                     </li>
                     <li>
                        <a href="join.jsp">Sign up</a>
                     </li>
                  </ul>
               </li>
            </ul>
            <% // 로그인이 되어있는 상태에서 보여주는 화면
               }else{
               
                  %>
                  <ul class="nav navbar-nav navbar-right">
                  <li class="dropdown">
                     <a href="#" class="dropdown-toggle"
                     data-toggle="dropdown" role="button" aria-haspopup = "true"
                     aria-expanded="false">접속하기<span class="caret"></span></a>
                     <ul class ="dropdown-menu">
                        <li>
                           <a href="LogoutAction.jsp">Log out</a>
                        </li>
                     </ul>
                  </li>
               </ul>
               <%
               }
            %>
         </div>
      </nav>
      <!--   nav 끝 -->
      <!--   main 시작 -->
      <div class="container">
         <div class="row">
            <table class="table table-striped" style = "text-align: center; border:1px solid #dddddd">
               <thead>
                  <tr>
                     <th style="background-color:#eeeeee; text-align: center;">No</th>
                     <th style="background-color:#eeeeee; text-align: center;">Title</th>
                     <th style="background-color:#eeeeee; text-align: center;">Writer</th>
                     <th style="background-color:#eeeeee; text-align: center;">Date</th>
                  </tr>
               </thead>
               <tbody>
                  <%
                     ContentDao ct = new ContentDao();
                     ArrayList<Contents> list = ct.getList(pageNumber);
                     for(int i =0; i<list.size(); i++){
                        
                     
                  %>
                  <tr>
                     <td>
                        <%=list.get(i).getContentID() %>
                     </td>
                     <td>
                        <a href="view.jsp?contentID=<%= list.get(i).getContentID() %>">
                        <%=list.get(i).getTitle() %>
                        </a>
                     </td>
                     <td>
                        <%=list.get(i).getUserID() %>
                     </td>
                     <td>
                        <%=list.get(i).getDate().substring(0,11)+list.get(i).getDate().substring(11,13)+"시"
                        + list.get(i).getDate().substring(14,16)+"분" %>
                     </td>
                  </tr>
                  <%
                  }
                  %>
                        
               </tbody>
            </table>
            <!-- 페이징 처리 -->
            <%
               if(pageNumber !=1) {
            %>	   
               <a href="board.jsp?pageNumber=<%=pageNumber -1 %>"
                  class = "btn btn-success btn-arraw-left"> Pre
               </a>
            <% } %>
            <%
               if(ct.nextPage(pageNumber+1)) {
            	   
               
            %>
            <a href="board.jsp?pageNumber=<%=pageNumber +1 %>"
                  class = "btn btn-success btn-arraw-left"> Next
               </a>
           <% } %>
            
  
            
            
            <!-- 글쓰기 버튼 -->
            <a href="write.jsp" class ="btn btn-primary pull-right">글쓰기</a>
         </div>
      </div>
   </body>
</html>