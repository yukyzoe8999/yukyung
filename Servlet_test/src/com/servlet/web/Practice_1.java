package com.servlet.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc2")

public class Practice_1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		String str = "넘버";
		req.setAttribute("number",str);
		
		RequestDispatcher rd = req.getRequestDispatcher("Practice_2_2.jsp");
		rd.forward(req, res);
		
		
	}
}
