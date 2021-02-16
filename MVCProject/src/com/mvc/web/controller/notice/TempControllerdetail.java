package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Temp;
import com.mvc.web.service.TempService;

@WebServlet("/tempregion")
public class TempControllerdetail extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		TempService tmm = new TempService();

		String date = req.getParameter("date");
		// List <Temp> listtemp = tm.tempregion(date);

		Temp t = tmm.tempregion(date);

		req.setAttribute("temp", t);
		req.getRequestDispatcher("WEB-INF/view/notice/Tempregion.jsp").forward(req, res);

	}
}
