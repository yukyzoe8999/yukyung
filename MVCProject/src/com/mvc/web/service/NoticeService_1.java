package com.mvc.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Notice;

public class NoticeService_1 {
	public List<Notice> getNoticedetail() {
		List<Notice> list = new ArrayList<Notice>();
	String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String root = "root";
    String pw = "woojin7929M";
    String driver = "com.mysql.jdbc.Driver";
	
		String sql = "Select * from notice";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			rs.next();
			String title = rs.getString("title");
			String write_id = rs.getString("writer_id");
			String content = rs.getString("content");

			
			Notice nt = new Notice(title, write_id, content);
			list.add(nt);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;
}
}

