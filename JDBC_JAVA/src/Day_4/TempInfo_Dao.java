package Day_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.jdbc.app.entity.Notice;

public class TempInfo_Dao {
	
	public void insert(TempInfo_beans bs) {
		String url = "jdbc:mysql://localhost:3306/HOME_WORK?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "woojin7929M";
		int result =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력해주세요. ex)20210118");
		String date = sc.nextLine();
		System.out.println("온도를 입력해주세요.");
		int temp = sc.nextInt();
		
	String sql = "INSERT INTO temp(" 
			+ "Date," 
			+ "Temp" 
			+ ")VALUES(?,?)";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, id, pw);
		PreparedStatement psmt = con.prepareStatement(sql);
		
		psmt.setString(1, date);
		psmt.setInt(2, temp);
		
		result = psmt.executeUpdate();
		System.out.println(result+" 건이 입력되었습니다.");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return result;
	}
	
	public List<TempInfo_beans> getList() {
		String url = "jdbc:mysql://localhost:3306/HOME_WORK?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "woojin7929M";
		
		List<TempInfo_beans> list = new ArrayList<TempInfo_beans>();
		String sql = "select * " + "from temp";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pw);
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String date = rs.getString("Date");		
				int temp = rs.getInt("Temp");

				TempInfo_beans tb = new TempInfo_beans(date, temp);
				list.add(tb);


			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public void print(TempInfo_beans bs) {
		
		List<TempInfo_beans> list = getList();
		System.out.println(list);
		
		for (TempInfo_beans t : list) {
			
			String date = t.getDate();
			int temp = t.getTemp();
		
			
			System.out.println("날짜: "+date);
			System.out.println("온도: "+temp);
		}
		
		
	}

	public void update(TempInfo_beans bs) {
		String date = bs.getDate();
		int temp = bs.getTemp();
			
	String sql = "update notice"
			+" date = ?,"
			+" temp = ?,";
	

}
}
