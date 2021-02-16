package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeCountService;

@WebServlet("/count")
public class NoticeCountController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		NoticeCountService ncs = new NoticeCountService();
		List<Notice> list = ncs.getNoticeList();
		
		req.setAttribute("count", list);
		req.getRequestDispatcher("WEB-INF/view/notice/NoticeCount.jsp").forward(req, res);
	}

}
