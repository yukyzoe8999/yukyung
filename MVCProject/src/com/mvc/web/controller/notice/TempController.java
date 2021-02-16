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

@WebServlet("/temp")
public class TempController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	TempService tm = new TempService();
	List <Temp> listtemp = tm.tempserve();
	
	req.setAttribute("listtemp", listtemp);
	req.getRequestDispatcher("WEB-INF/view/notice/NewTemp.jsp").forward(req, res);

}
}
