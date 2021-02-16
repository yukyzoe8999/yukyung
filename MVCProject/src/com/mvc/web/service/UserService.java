package com.mvc.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.entity.User;

public class UserService {
	private String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "woojin7929M";
	private String driver = "com.mysql.jdbc.Driver";
	
	public User getUser(String name) {
		User u = null;
		try {
			String sql = "select * from user where name = ?";
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name_ = rs.getString("name");
				String email = rs.getString("email");				
				String hp = rs.getString("hp");
				Date regDate = rs.getDate("regdate");

				 u = new User(id, name_, email, hp, regDate);
			

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return u;
	}
}
