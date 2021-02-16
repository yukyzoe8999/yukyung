package com.mvc.web.controller.admin;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;


@WebServlet("/admin/board/notice/detail")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);

		NoticeService ns = new NoticeService();

		ns.countNoticeHit(id); // hit 카운트
		Notice nt = ns.getNoticeDetail(id); //페이지 호출
		//int nss = ns.deleteNotice(id);
		
		
		req.setAttribute("nt", nt);
		//req.setAttribute("nss", nss);
		//System.out.println(nss);
	

		req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/detail.jsp").forward(req, res);

	}
}
