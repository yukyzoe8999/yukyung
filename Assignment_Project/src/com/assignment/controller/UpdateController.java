package com.assignment.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assignment.beans.Contents;
import com.assignment.service.ContentDao;

@WebServlet("/homework/homepage/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String title = req.getParameter("Title");
		String content = req.getParameter("Content");
		String contnetid = req.getParameter("ContentID");
		int cid = Integer.parseInt(contnetid);
		
		Contents ct = new Contents();

		ct.setTitle(title);
		ct.setContent(content);
		ct.setContentID(cid);

		ContentDao cd = new ContentDao();

		cd.update(cid, title, content);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/lib/homework/homepage/update.jsp").forward(req, resp);
	}
}
