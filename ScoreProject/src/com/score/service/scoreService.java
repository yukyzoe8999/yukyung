package com.score.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.score.entity.score;

public class scoreService {
	private String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "woojin7929M";
	private String driver = "com.mysql.jdbc.Driver";
	
	public List<score> getList(String field, String query) throws ClassNotFoundException, SQLException {
		List<score> list = new ArrayList<score>();
		String sql = "select result.location as location,"
				+"           result.name as name,"
				+"           result.date as date,"
				+"           result.enemy as enemy"
				+" from(select a.locname as location,"
			    +"    b.name  as name, "
		        +"    c.regdate as date,"
		        +"    c.enemy as enemy"
		        +"  from(select id, locname"
			 	+"  from location"
			    +"   where flag = 'y')a,"
			    +"      (select id, name"
			    +"  from user"
			    +"   where flag ='Y')b,"
			    +"      (select id, hiter, regdate, enemy, seq"
			  	+"  from score)c"
		        +"   where a.id = c.seq"
		        +" and b.id = c.hiter)result"
		        +" where result."+field+" like ?";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, root, pw);
		PreparedStatement psmt = con.prepareStatement(sql);
		
		psmt.setString(1, "%"+query+"%");
		
		ResultSet rs = psmt.executeQuery();
		
		while(rs.next()) {
			String location = rs.getString("location");
			String name = rs.getString("name");
			Date date = rs.getTimestamp("date");
			String enemy = rs.getString("enemy");
			
			score sr = new score(location, name, date, enemy);
			list.add(sr);
		}
		
		con.close();
		psmt.close();
		rs.close();
		return list;
		
	}
	
}
