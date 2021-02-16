package com.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.beans.User;
import com.assignment.service.UserDao;

@WebServlet("/homework/homepage/Login")
public class LoginController extends HttpServlet{

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String userid = req.getParameter("userID");
	String userpass = req.getParameter("userPASS");
	User us = new User();
	us.setUserID(userid);
	us.setUserPASS(userpass);
	
	//System.out.println("fffffffffff"+userid+userpass);
	
	UserDao ud = new UserDao();
	ud.login(userid, userpass);
	
	
	}

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.getRequestDispatcher("/WEB-INF/lib/homework/homepage/Login.jsp").forward(req, resp);
}
}
