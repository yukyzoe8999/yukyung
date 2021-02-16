package Day_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ranking {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String root = "root";
	String pw = "woojin7929M";

	System.out.println("지역이름을 입력해주세요.");
	String locid = sc.nextLine();
	System.out.println("평균온도를 확인할 년, 월을 입력해주세요. ex.202004");
	String month = sc.nextLine();
	
	 String sql = "select loc.locname as location,"  
	          +" t.ranking as ranking,"
	          +" u.name as name"
              +" from(select id, locname"
 	          +" from location)loc,"
	          +"(select id, name"
	          +" from user)u,"
     	      +"(select count.writer, "
                   +" rank()over(order by count.score desc) as ranking,"
                   +" count.locid"
	          +" from (select count(writer)as score, writer, locid"
        	           +" from temp"
       	          +" where locid ="+"'"+locid+"'"
       	       +" and date like"+"'"+month+"%'"
     	            +" group by writer)count)t"
              +" where loc.id = t.locid"
              +"and t.writer = u.id";

	try {
		System.out.println(sql);
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, root, pw);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String location = rs.getString("location");
			String ranking = rs.getString("ranking");
			String name = rs.getString("name");
			
			System.out.println("지역: "+location);
			System.out.println("순위: "+ranking);
			System.out.println("이름: "+name);
		}
	}catch(Exception e){
	
		e.printStackTrace();

	}
	}
}
