package DAY_2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Programme {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String id = "root";
		String pw = "woojin7929M";
		
		String title ="test title";
		String writer_id ="이현수";
	    String content ="test 중입니다.";
	    String files ="";

		String sql = "insert into notice("
				   + " title,"
				   + " writer_id,"
				   + " content,"
				   + " files"
				   + ") values(?, ?, ?, ?)"; //preparestatement 구문
				   
//				   + ")values("
//				   + " '"+title+"',"
//				   + " '"+writer_id+"',"
//				   + " '"+content+"',"
//				   + " '"+files+"')"; // just statement 구문 
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection(url, id, pw);
			//Statement st = con.createStatement();
			
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, title);
			psmt.setString(2, writer_id);
			psmt.setString(3, content);
			psmt.setString(4, files);
			
			int result = psmt.executeUpdate(); //just statement 일때 (sql)넣어주기
			// int result 는 넣은 갯수
			System.out.println(result);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
			
		}

	}

}

//insert into notice values(1, 'jdbc 배우기', '이현수' , '잘 배워봅시다.', sysdate(), 0, '');

//while 문을 가지고 if(hit>10)  x  select *  from notice where hit>10 o
//show table status where name = 'notice';
//alter table notice auto_increment=1; 초기//
//alter table notice modify id int not null auto_increment;
