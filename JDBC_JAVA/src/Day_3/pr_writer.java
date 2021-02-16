package Day_3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

public class pr_writer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rdm = new Random();
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";

		String str [] = {"yukyung", "minjun", "kyungji", "shinho", "minji"};
		int date = 20201201;
		int locid = 1;
		int j = 0;
		EXIT: for (int i = date; i <= date + 30; i++) {

			int temp = rdm.nextInt(15) - 4;

			String sql = "insert into temp(" + " date , " + " temp ," + " locid, " + " writer " + ") values(?, ?, ?, ?)";

			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, root, pw);
				PreparedStatement psmt = con.prepareStatement(sql);

				
				String date2 = Integer.toString(i);
				psmt.setString(1, date2);
				psmt.setInt(2, temp);
				psmt.setInt(3, locid);
				psmt.setString(4, str[j]);
				j++;
				
				if(j==5) {
					j=0;
				}

				int result = psmt.executeUpdate();

				if (i == 20201231) {
					i = 20201200;
					locid++;
				}
				if (locid == 11) {
					break EXIT;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
	}
}
