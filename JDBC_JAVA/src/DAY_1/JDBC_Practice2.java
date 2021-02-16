package DAY_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JDBCDAO dao = new JDBCDAO();
		
		boolean run = true;
		
		while(run) {
			System.out.println("무엇을 하시겠습니까? (1. 글쓰기 || 2. 글 조회 || 3. 종료하기");
			int select = sc.nextInt();
		switch(select) {
		case 1:
			//글쓰기
			dao.write_document();
			break;
		case 2:
			//글 조회
			dao.check_document();		
			dao.view_document();
			break;
		case 3:
			//종료
			System.out.println("Good Bye!");
			run = false;
			break;
		}
		}
	}

}




