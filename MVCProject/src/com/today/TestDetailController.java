package com.today;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testdetail")
public class TestDetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		TestService ts = new TestService();
		
		int t = Integer.parseInt(req.getParameter("seq"));
		
		Test test = ts.getTestDetail(t);
		
		req.setAttribute("test", test);
		req.getRequestDispatcher("WEB-INF/view/notice/TestviewDetail.jsp").forward(req, res);

		
		
		
		
	}

}
