package DAY_2_2.copy;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";
		
		System.out.println("어느 지역을 입력하시겠습니까?");
		String location = sc.nextLine();

        String locsql = "select id from location where locname = ?";
        int id = 0;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(locsql);
         		psmt.setString(1, location);
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					id = rs.getInt("id");
				}
			

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			System.out.println("날짜를 입력해주세요. EX)YYYYMMDD");
			String date = sc.nextLine();
			System.out.println("온도를 입력해주세요. (-30 ~ 30)");
			int temp = sc.nextInt();
			sc.nextLine();
			
			String sql = "insert into temp(" + " date , " + " temp ," + " locid " + ") values(?, ?, ?)";
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(sql);

				
				psmt.setString(1, date);
				psmt.setInt(2, temp);
				psmt.setInt(3, id);

				int result = psmt.executeUpdate();
				System.out.println(result +" 건이 입력되었습니다.");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}

