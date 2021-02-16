package Day_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class TEST_in {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";
		
		String sql = "insert into score (id,"
	               + "enemy,"
	               + "hiter,"
	               + "content,"
	               + "memo"
	               + ")values (?,?,?,?,?)";

		
		System.out.println("ID를 입력하세요");
		int id = sc.nextInt();
		System.out.println("패스워드를 입력하세요");
		String pass = sc.next();
		System.out.println("사용자 이름을 입력하세요");
		String name = sc.next();
		System.out.println("e-mail를 입력하세요");
		String mail = sc.next();
		System.out.println("Y or N");
		String flag= sc.next();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);

		
			psmt.setInt(1, id);
			psmt.setString(2, pass);
			psmt.setString(3, name);
			psmt.setString(4, mail);
			psmt.setString(5, flag);
			

			int result = psmt.executeUpdate();
			System.out.println(result +" 건이 입력되었습니다.");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}
}
