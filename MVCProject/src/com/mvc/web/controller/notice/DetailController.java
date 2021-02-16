package com.mvc.web.controller.notice;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.entity.NoticeComment;
import com.mvc.web.service.NoticeService;


@WebServlet("/notice/detail")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);

		NoticeService ns = new NoticeService();

		ns.countNoticeHit(id); // hit 카운트
		Notice nt = ns.getNoticeDetail(id); //페이지 호출
		
		NoticeComment nc = new NoticeComment();

		req.setAttribute("nt", nt);
		
		int comCount = 0;
		comCount = ns.getNoticeCommentCount(id);
		
		if(comCount !=0) {
			List<NoticeComment> list = ns.getCommentList(id);
			
			req.setAttribute("comList", list); //list 보내기
			
		}
		req.setAttribute("count", comCount); // 조회 된 목록 갯수
		req.getRequestDispatcher("/WEB-INF/view/notice/detail.jsp").forward(req, res);

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset = UTF-8");
		
		String comment = req.getParameter("comment");
		String pId = req.getParameter("pageID");
		int pageId = Integer.parseInt(pId);
		String writerID = req.getParameter("writerId");
		int result = 0;
		NoticeService ns = new NoticeService();
		NoticeComment nc = new NoticeComment();
		
		
		System.out.println("ddd"+comment+pageId+writerID);
		nc.setMid(pageId);
		nc.setComment(comment);
		nc.setWrite_id(writerID);
		
		result = ns.insertNoticeComment(nc);
		
		resp.sendRedirect("detail?id=" + pId);
		
		//resp.sendRedirect("detail");
	}
}
