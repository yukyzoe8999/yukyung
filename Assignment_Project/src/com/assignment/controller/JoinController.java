package com.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.beans.User;
import com.assignment.service.UserDao;

@WebServlet("/homework/homepage/join")
public class JoinController extends HttpServlet{

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	User us = new User();
	
	String userid = req.getParameter("userID");
	String userpass = req.getParameter("userPASS");
	String username = req.getParameter("userName");
	String usergender = req.getParameter("userGender");
	String useremail = req.getParameter("userEmail");
	
	us.setUserID(userid);
	us.setUserPASS(userpass);
	us.setUserName(username);
	us.setUserGender(usergender);
	us.setUserEmail(useremail);
	
	System.out.println("dddddddddddd"+userid+userpass+username+usergender+useremail);
	
	UserDao ud = new UserDao();
	ud.join(us);
	
	
	
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	req.getRequestDispatcher("/WEB-INF/lib/homework/homepage/join.jsp").forward(req, resp);
}
}
