package DAY_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Practice {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/JDBC?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "woojin7929M";

		String sql = "select * " + "from notice";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) { // DB값이 있을때만 실행되고, 없으면 아무것도 없음
				String title = rs.getString("title");
				String writer_id = rs.getString("writer_id");
				String str_date = rs.getString("regdate");
				System.out.println("제목 :" + title);
				System.out.println("ID :"+writer_id);
				System.out.println(str_date.substring(0,4)+"년"+str_date.substring(5,7)+"월"+str_date.substring(8,10)+"일"+str_date.substring(11,13)+"시");
				
			}
			System.out.println("모든 값이 출력되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
