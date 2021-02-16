package com.mvc.web.controller.notice;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;

@WebServlet("/notice/list")
public class ListController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		NoticeService ns = new NoticeService();
		// 파라미터 받기
		String page_ = req.getParameter("p");
		String field_ = req.getParameter("f");
		String query_ = req.getParameter("q");

		// 매개변수 초기화
		int page = 1;
		String field = "title";
		String query = "";
		// null값 보완 및 매개변수 입력
		if (page_ != null&&!page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		if (field_ != null&&!field_.equals("")) {
			field = field_;
		}
		if (query_ != null&&!query_.equals("")) {
			query = query_;
		}

		System.out.println("page : " + page);
		System.out.println("field : " + field);
		System.out.println("query : " + query);

		List<Notice> list = ns.getPubNoticeList(page, field, query); // 1
		
		int count = 0;
		
		count= ns.getNoticeCount(field, query);
		
		System.out.println(count);

		req.setAttribute("list", list); // list 보내기
		req.setAttribute("count", count); //조회 된 목록 갯수
		req.getRequestDispatcher("/WEB-INF/view/notice/list.jsp").forward(req, res);

	}
}
