package com.mvc.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.app.entity.Temp;


public class TempService {
	private String url = "jdbc:mysql://localhost:3306/HOME_WORK?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String id = "root";
	private String pw = "woojin7929M";
	private String driver = "com.mysql.jdbc.Driver";
	
	public List<Temp> tempserve() {
	List<Temp> templist = new ArrayList<Temp>();
	String sql = "select * from temp";
	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			String date = rs.getString("Date");		
			int temp = rs.getInt("Temp");
			String writer = rs.getString("writer");

			Temp tm = new Temp(date, temp, writer);

			templist.add(tm);

		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return templist;
}
	
	public Temp tempregion(String date) {
	Temp tm = null;
		String sql = "select * from temp where date = "+"'"+date+"'";
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, id, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			
			ResultSet rs = psmt.executeQuery(sql);
			while (rs.next()) {
				String date_ = rs.getString("Date");		
				int temp = rs.getInt("Temp");
				String writer = rs.getString("writer");

				tm = new Temp(date_, temp, writer);

				

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tm;
		
	}
}
