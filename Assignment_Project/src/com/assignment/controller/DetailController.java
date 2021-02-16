package com.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.beans.Contents;
import com.assignment.service.ContentDao;

@WebServlet("/homework/homepage/detail")
public class DetailController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String userID = null;
	if (req.getAttribute("userID") != null) {
		userID = (String) req.getAttribute("userID");
	}
	
	int contentID=0;
	if(req.getParameter("contentID")!=null) {
		contentID =Integer.parseInt(req.getParameter("contentID"));
	}
	
//	if(contentID==0) { //정상적으로 글이 조회되지 않았을 경우
//		   PrintWriter script = response.getWriter();
//		   script.println("<script>");
//		   script.println("alert('유효하지 않은 글입니다.')");
//		   script.println("location.href ='board.jsp'");
//		   script.println("</script>");
//	}
	
	Contents ct = new ContentDao().getContents(contentID);
	req.setAttribute("contentID", contentID);
	
	req.getRequestDispatcher("/WEB-INF/lib/homework/homepage/detail.jsp").forward(req, resp);
}
}