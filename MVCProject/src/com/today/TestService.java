package com.today;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestService {
	private String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "root";
	private String pw = "woojin7929M";
	private String driver = "com.mysql.jdbc.Driver";
	
	public int getDelete(int [] seq) {
		
		String sql = "delete from score where seq = ?";
			
		
		int result = 0;
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);

			for (int i = 0; i < seq.length; i++) {
				int seqn = seq[i];
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setInt(1, seqn);
				psmt.executeUpdate();
				result++;

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
		return result;
	}
	
	public List<Test> getTest(int page, String idname, String findname) {
		List<Test> list = new ArrayList<Test>();
		int start = 1+(page-1)*10; //1, 11, 21, 31, 41 
		int end = page*10; //10 20 30 40 50
		String sql = "select *"
				 +" from (Select @rownum:=@rownum+1 as num , n.*"
				 +" from((select s.id as ID, loc.locname as LOCATION, s.regdate as DATE, u.name as NAME, s.enemy as ENEMY, s.content as CONTENT, s.seq as SEQ s.mark as MARK from"
			     +" (select id, name from user)u,"
			     +" (select id, locname from location)loc,"
				 +" (select id, hiter, enemy, regdate, content, seq, mark from score)s"
				 +" where loc.id = s.id"
				 +" and u.id = s.hiter"
				 +" and "+idname+" like ?)"
				 +"	order by regdate desc)n"
				 +" Where (@rownum:=0)=0) num "
				 +" Where num.num between ? and ? ";
		try {
			//System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, "%"+findname+"%");
			psmt.setInt(2, start);
			psmt.setInt(3, end);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("ID");
				String locname = rs.getString("LOCATION");
				Date regdate = rs.getDate("DATE");
				String name = rs.getString("NAME");
				String enemy = rs.getString("ENEMY");
				String content = rs.getString("CONTENT");
				int seq = rs.getInt("SEQ");
				String mark = rs.getString("MARK");
				boolean ma = false;
				if(mark.equals("Y")) {
					ma =  true;
				}
				Test tt = new Test(id, locname, regdate, name, enemy, content, seq, ma);
				list.add(tt);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return list;
	}
	public Test getTestDetail(int seq) {
		Test tes = null;
		
		String sql = "select s.id as ID, loc.locname as LOCATION, s.regdate as DATE, u.name as NAME, s.enemy as ENEMY, s.content as CONTENT, s.seq as SEQ s.mark as MARK from"
				+"(select id, name from user)u,"
				+"(select id, locname from location)loc,"
				+"(select id, hiter, enemy, regdate, content, seq, mark from score)s"
				+" where loc.id = s.id"
				+" and u.id = s.hiter"
				+" and s.seq = ?";
		try {
			//System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, seq);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				int id_ = rs.getInt("ID");
				String locname = rs.getString("LOCATION");
				Date regdate = rs.getTimestamp("DATE");
				String name = rs.getString("NAME");
				String enemy = rs.getString("ENEMY");
				String content = rs.getString("CONTENT");
				seq = rs.getInt("SEQ");
				String mark = rs.getString("MARK");
				boolean ma = false;
				if(mark.equals("Y")) {
					ma =  true;
				}
				tes = new Test(id_,locname, regdate, name, enemy, content, seq, ma);
				

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return tes;
	}
	public int getcount() {
		return getCount("NAME", "");
	}
	public int getCount(String field, String query) {
		int count =0;
		String sql = "select count(num.id) as count"
				 +" from (Select @rownum:=@rownum+1 as num , n.*"
				 +" from((select s.id as ID, loc.locname as LOCATION, s.regdate as DATE, u.name as NAME, s.enemy as ENEMY, s.content as CONTENT, s.seq as SEQ s.mark as MARK from"
			     +" (select id, name from user)u,"
			     +" (select id, locname from location)loc,"
				 +" (select id, hiter, enemy, regdate, content, seq, mark from score)s"
				 +" where loc.id = s.id"
				 +" and u.id = s.hiter"
				 +" and "+field+" like ?)"
				 +"	order by regdate desc)n"
				 +" Where (@rownum:=0)=0) num ";
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);

			psmt.setString(1, "%"+query+"%");

			ResultSet rs = psmt.executeQuery();
			
			if(rs.next())
				count = rs.getInt("count");
		

	}catch(

	Exception e)
	{
		e.printStackTrace();

	}
		return count;
	}

	public int getDeleteAll(int[] idnum) {
		int result = 0;
		String str = "";
		
		for(int i=0; i<idnum.length;i++) {
			str +=idnum[i];
			if(i<idnum.length-1) {
				str +=",";
			}
		}
		String sql =" delete from score where seq in("+str+")";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
		    Statement st = con.createStatement();		    
		    result = st.executeUpdate(sql);
				

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		return result;
	}

	public int insertTest(Test ts) {
		int result = 0;
		String sql = "insert into score (ENEMY, CONTNENT)"
				+"VALUE(?,?)";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);	
			
			psmt.setString(1, ts.getEnemy());
			psmt.setString(2, ts.getContent());
		
			String mark = "N";
			if(ts.getMark()==true) {
				mark = "Y";
				psmt.setString(3, mark);
			}
			
		    result = psmt.executeUpdate();
				

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0;
	}
	}
