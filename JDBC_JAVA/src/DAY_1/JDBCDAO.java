package DAY_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDAO {
	
	public void view_document() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 글을 보시겠습니까?");
		int num =sc.nextInt();
		
		ConnectionPool cp = new ConnectionPool();
		
		String sql = "select * " + "from notice where id = "+num;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = cp.con;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			 rs.next();  
				String title = rs.getString("title");
				String content = rs.getString("content");
				System.out.println("제목: "+title);
				System.out.println("내용: "+content);
				

			 }catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void check_document() { //글 조회
		ConnectionPool cp = new ConnectionPool();
		
		String sql = "select * " + "from notice";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = cp.con;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) { // DB값이 있을때만 실행되고, 없으면 아무것도 없음
				int id_print = rs.getInt("id");
				String title = rs.getString("title");
				//String writer_id = rs.getString("writer_id");
				String str_date = rs.getString("regdate");
				System.out.println(id_print);
				System.out.println("제목 :" + title);
				//System.out.println("ID :"+writer_id);
				System.out.println(str_date.substring(0,4)+"년"+str_date.substring(5,7)+"월"+str_date.substring(8,10)+"일"+str_date.substring(11,13)+"시");
				
			}
			System.out.println("모든 값이 출력되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void write_document() { //글쓰기
		ConnectionPool cp = new ConnectionPool();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("제목을 입력하세요.");
		String title_main = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String writer_id = sc.nextLine();
		System.out.println("글을 써주세요.");
		String content = sc.nextLine();
		System.out.println("파일을 첨부하시겠습니까?");
		String files = sc.nextLine();

		String sql = "INSERT INTO NOTICE(" 
				+ "TITLE," 
				+ "WRITER_ID," 
				+ "CONTENT,"
				+ "FILES"
				+ ")VALUES(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = cp.con;
			// Statement st = (Statement) con.createStatement();
			// int result = st.executeUpdate(sql);

			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, title_main);
			psmt.setString(2, writer_id);
			psmt.setString(3, content);
			psmt.setString(4, files);

			int result = psmt.executeUpdate();
			if (result == 1) {
				System.out.println("정상적으로 입력 되었습니다.");
			} else {
				System.out.println("입력되지 못했습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
