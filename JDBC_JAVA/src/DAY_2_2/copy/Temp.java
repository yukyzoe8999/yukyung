package DAY_2_2.copy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Temp {
	
		final String url;
		final String id;
		final String pw;
		Connection con;
		public Temp() {
		url = "jdbc:mysql://localhost:3306/HOME_WORK?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		id = "root";
		pw = "woojin7929M";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
