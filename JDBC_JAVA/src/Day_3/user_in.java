package Day_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class user_in {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";
		
		String sql = "insert into USER (seq,"
	               + "id,"
	               + "name,"
	               + "email,"
	               + "hp,"
	               + "flag"
	               + ")values ((select c.count"
	               + " from (select max(seq)+1 as count"
	               + " from user)c),?,?,?,?,?)";
	               //+ "?,?,?,?,?)";
//	               + "?,"
//	               + "?,"
//	               + "?,"
//	               + "?)";
		
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
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);

		
			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setString(3, mail);
			psmt.setString(4, hp);
			psmt.setString(5, flag);
			

			int result = psmt.executeUpdate();
			System.out.println(result +" 건이 입력되었습니다.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
