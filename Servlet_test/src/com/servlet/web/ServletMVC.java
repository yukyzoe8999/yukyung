package com.servlet.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class ServletMVC extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String str = "안녕하세요.";
		req.setAttribute("bow", str); //req라는 저장소에 bow라는 이름으로 str을 담아서 던짐
		
		String member[] = {"이경민", "정민재", "김태완"};
		req.setAttribute("member", member);
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("안녕");
		list.add("반가워");
		list.add("3");
		req.setAttribute("list", list);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
		map.put("title", "EL CODE TEST");
		map.put("number", 5);
		req.setAttribute("map", map);
		
		RequestDispatcher dis = req.getRequestDispatcher("TestNew.jsp");
		dis.forward(req, res);
		
	}
}
