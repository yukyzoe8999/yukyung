package com.mvc.web.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.User;
import com.mvc.web.service.UserService;

@WebServlet("/useri")
public class UseControllersecond extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		UserService us = new UserService();
		
		String name = req.getParameter("name");

		User userlist = us.getUser(name);
		
		
		req.setAttribute("userlist", userlist);
		req.getRequestDispatcher("WEB-INF/view/notice/Homeview.jsp").forward(req, res);
	}
}
