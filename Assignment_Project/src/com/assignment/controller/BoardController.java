package com.assignment.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.beans.Contents;
import com.assignment.service.ContentDao;

@WebServlet("/homework/homepage/board")
public class BoardController extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Contents ct = new Contents();

	String pagenum = req.getParameter("pageNumber");
	System.out.println(pagenum);
	
//	int p = Integer.parseInt(pagenum);
//	System.out.println(p);
	int p = 1;
	ContentDao cd = new ContentDao();
	
	System.out.println("으으으으ㅜ으");
	List<Contents> ac = cd.getList(p);
	for(Contents z : ac) {
		System.out.println(z.getTitle());
	}
	
	req.setAttribute("list", ac);
	
	
	req.getRequestDispatcher("/WEB-INF/lib/homework/homepage/board.jsp").forward(req, resp);

	
}
}
