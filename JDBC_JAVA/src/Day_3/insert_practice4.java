package Day_3;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class insert_practice4 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "woojin7929M";
		
		//temp 테이블에 날짜, 온도, 지역id 를 입력하는 코드
		String day ="";
		System.out.println("지역이름을 입력해주세요.");
		String locid = sc.nextLine();
		System.out.println("평균온도를 확인할 월을 입력해주세요. ex.04");
		String month = sc.nextLine();

		String sql = "select loc.id, loc.locname, t.temp, t.date"
			    +" from location loc, temp t"
			    +" where loc.id=t.locid"
			    +" and loc.locname="+"'"+locid+"'"
			    +" and Date like"+"'2020"+month+"%'";
		
		int sum = 0;
		double avg = 0;
				   
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection(url, root, pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			ArrayList<String> avglist = new ArrayList<String>();

			
			while(rs.next()) {
				String date = rs.getString("date");
				String loc = rs.getString("locname");
				int temp = rs.getInt("temp");
				String name = rs.getString("writer");
				
				avglist.add(date);
				int aa = avglist.size();
					sum+=temp;
					avg = sum/aa;
					
					System.out.println("날짜 : "+ date);
					System.out.println("지역 : "+loc);
					System.out.println("온도 : "+temp);
					System.out.println("작성자 : "+name);
					
			}		System.out.println("평균 온도 : "+avg);
			
		} catch (Exception e) {
			e.printStackTrace();			
		}
	}
}
