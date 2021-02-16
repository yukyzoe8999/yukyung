package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService_1;

@WebServlet("/details")
public class NoticeDetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		NoticeService_1 ns = new NoticeService_1();
		List<Notice> detail = ns.getNoticedetail();
		
		req.setAttribute("detail", detail);
		req.getRequestDispatcher("WEB-INF/view/notice/NoticeView.jsp").forward(req, res);
	}
}
