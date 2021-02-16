package com.home_work.app.service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

import com.home_work.app.entity.*;

import Day_4.TempInfo_beans;

public class WeatherService {		//DAO
//	private String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//	private String root = "root";
//	private String pw = "rkwhr00700";
	String url = "jdbc:mysql://localhost:3306/HOME_WORK?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String root = "root";
	String pw = "woojin7929M";
	private String driver = "com.mysql.jdbc.Driver";
	
	public int insert(UserBeans wb) {
			Scanner sc = new Scanner(System.in);
		    int result = 0;
			String usersql = "select seq from user where seq = ?";
	        int seq = 0;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);
					PreparedStatement psmt = con.prepareStatement(usersql);
	         		psmt.setInt(1, seq);
					ResultSet rs = psmt.executeQuery();
					
					while(rs.next()) {
						seq = rs.getInt("seq")+1;
					}
				

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
				System.out.println("ID를 입력하세요");
				String id = sc.nextLine();
				System.out.println("사용자 이름을 입력하세요");
				String name = sc.nextLine();
				System.out.println("e-mail를 입력하세요");
				String mail = sc.nextLine();
				System.out.println("핸드폰 번호를 입력하세요");
				String hp= sc.nextLine();
				System.out.println("Y or N");
				String flag= sc.nextLine();
				
				
				String sql = "insert into user(" + " seq , " + " id , " + " name ," + " email, " + " hp ," + " flag " + ") values(?, ?, ?, ?, ?, ?)";
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, root, pw);
					PreparedStatement psmt = con.prepareStatement(sql);

					psmt.setInt(1, seq);
					psmt.setString(2, id);
					psmt.setString(3, name);
					psmt.setString(4, mail);
					psmt.setString(5, hp);
					psmt.setString(6, flag);
					

					result = psmt.executeUpdate();
					UserBeans ub = new UserBeans(seq, id, name, mail, hp, flag);
					
					System.out.println(result +" 건이 입력되었습니다.");

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
				return result;
			
		} 
	public int update(UserBeans wb) {
		Scanner sc = new Scanner(System.in);
	
	    String name = wb.getName();
	    String mail =wb.getEmail();
	    String hp = wb.getHp();
	    String flag = wb.getFlag();
	    String id = wb.getId();
	    int result =0;

		String sql = "update user"
				+" set"
				+" name = ?,"
				+" email = ?,"
				+" hp = ?,"
				+" flag = ?"
				+" where id = ? ";

		try {
			Class.forName(driver); 
			Connection con = DriverManager.getConnection(url, root, pw);
			
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, mail);
			psmt.setString(3, hp);
			psmt.setString(4, flag);
			
			result = psmt.executeUpdate(); 
			
			System.out.println(result);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();			
			
		}
		return result;
}
	
	public void check(UserBeans wb) {
		Scanner sc = new Scanner(System.in);
	
	String sql = "select * from USER where flag = Y";

	try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, root, pw);
	
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			int seq = rs.getInt("seq");
			String ID = rs.getString("id");				
			String name = rs.getString("name");
			String email = rs.getString("email");
		    String hp = rs.getString("hp");
		    Date regDate = rs.getDate("regdate");
		    String flag = rs.getString("flag");
									
		}

	} catch (Exception e) {
		
		e.printStackTrace();

	}
}
public int delete() { 
	    
		int result =0;
		String sql = "update user set flag = 'N' where id = ?";
		String flag = "Y";

		try {
			System.out.println(sql);
			Class.forName(driver); 
			Connection con = DriverManager.getConnection(url, root, pw);
			
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, flag);
			
			result = psmt.executeUpdate(); 
			
			System.out.println(result);
				
		} catch (Exception e) {
		
			e.printStackTrace();				
		}
		return result;
	}
}
