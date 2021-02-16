package Day_3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class user {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";
		
//		System.out.println("사용자 이름을 입력하세요");
//		String name = sc.nextLine();

		String usersql = "select seq from user where seq = ?";
        int seq = 0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(usersql);
         		//psmt.setInt(1, seq);
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
			sc.nextLine();
			
			String sql = "insert into temp(" + " seq , " + " id , " + " name ," + " email, " + " hp ," + " flag " + ") values(?, ?, ?, ?, ?, ?)";
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
				

				int result = psmt.executeUpdate();
				System.out.println(result +" 건이 입력되었습니다.");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}


