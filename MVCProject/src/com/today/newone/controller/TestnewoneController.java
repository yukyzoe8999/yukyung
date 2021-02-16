package com.today.newone.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.today.Test;
import com.today.TestService;

@WebServlet("/project/test/anotherfile")
public class TestnewoneController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset = UTF-8");
		
		String [] trys = req.getParameterValues("try");
		String [] dele = req.getParameterValues("delete");
		String cmd = req.getParameter("cmd");
	    
	    switch(cmd) {
	    case "TryAll" :
	    	for(String s : trys) {
	       	
	    		System.out.println("trys: "+s);
	    	}
	    	break;
	    case "DeleteAll":
	    	for(String s : dele) {
		       	
	    		System.out.println("trys: "+s);
	    	}
	        
	        int [] idnum = new int [dele.length];
	        for(int i=0; i<idnum.length;i++) {
	        	idnum[i] = Integer.parseInt(dele[i]);
	        }
	        TestService ts = new TestService();
			int outcome = ts.getDeleteAll(idnum);
			break;
			
	    }
	    System.out.println("cmd:"+cmd);
	    res.sendRedirect("anotherfile");
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		TestService ts = new TestService();
		int page = 1;

		String page_ = req.getParameter("p");
		String idname = req.getParameter("f");
		String findname = req.getParameter("q");

		String field = "NAME";
		String query = "";

		if (page_ != null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		if (idname != null && !idname.equals("")) {
			query = findname;
		}
		if (findname != null && !findname.equals("")) {
			query = findname;
		}

		System.out.println("page : " + page);
		System.out.println("field : " + field);
		System.out.println("query : " + query);

		List<Test> test = ts.getTest(page, field, query); // 1

		int count = 0;
		count = ts.getCount(field, query);
		System.out.println("count: " + count);

		req.setAttribute("test", test);
		req.setAttribute("count", count);
		req.getRequestDispatcher("/WEB-INF/show/project/test/anotherfile.jsp").forward(req, res);
	}
}
