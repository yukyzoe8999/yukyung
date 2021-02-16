package com.today.newone.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.today.Test;
import com.today.TestService;
@WebServlet("/project/test/writing")
public class TestWritingController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/show/project/test/writing.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String enemy = req.getParameter("ENEMY");
	String content = req.getParameter("CONTENT");
	boolean mark = Boolean.parseBoolean("open");
	int result = 0;
	
	Test tes = new Test();
	
	tes.setEnemy(enemy);
	tes.getContent();
	
	TestService ts = new TestService();
	result = ts.insertTest(tes);
	
	resp.sendRedirect("anotherfile");
	}

}
