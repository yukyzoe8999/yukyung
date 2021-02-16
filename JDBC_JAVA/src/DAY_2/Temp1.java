package DAY_2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Temp1 {

   public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
      String root = "root";
      String pw = "woojin7929M";
      boolean run = true;
      

      System.out.println("지역명을 입력하세요");
      String locname = sc.nextLine();
      System.out.println("Flag 를 설정하세요(Y,N)");
      String Flag = sc.nextLine();
      
      String sql = "insert into location("
                  + " locname , "
                  + " Flag "
                  + ") values(?, ?)";
      try {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(url, root, pw);
         PreparedStatement psmt = con.prepareStatement(sql);
         
         psmt.setString(1, locname);
         psmt.setString(2, Flag);
         
         int result = psmt.executeUpdate();
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();         
         
      }

   }
}
