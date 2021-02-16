package com.today.another.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
import com.today.Test;
import com.today.TestService;

@WebServlet("/anotherotherTest")
public class anotherController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String c[] = req.getParameterValues("check");
		int seq[] = new int[c.length];

		for (int i = 0; i < c.length; i++) {
			seq[i] = Integer.parseInt(c[i]);
		}
		TestService ts = new TestService();
		int outcome = ts.getDelete(seq);
		res.sendRedirect("anotherotherTest");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		TestService ts = new TestService();
		int page =1;
		
		String page_ = req.getParameter("p");
		String idname =req.getParameter("f");
		String findname =req.getParameter("q");
		
		String field = "NAME";
		String query = "";
		
		if (page_ != null&&!page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		if(idname!=null&& !idname.equals("")) {
			query = findname;
		}
		if(findname!=null&& !findname.equals("")) {
			query = findname;
		}
		

		System.out.println("page : "+page);
		System.out.println("field : "+field);
		System.out.println("query : "+query);
		
		List<Test> test = ts.getTest(page, field, query); //1
		
		int count = 0;
		count = ts.getCount(field, query);
		System.out.println("count: "+count);

		
		req.setAttribute("test", test);
		req.setAttribute("count", count);
		req.getRequestDispatcher("/WEB-INF/view/Test/anotherTest.jsp").forward(req, res);	
	}
}
