package DAY_1_1.copy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class TempDAO {
	int sum = 0;
	double plus_sum = 0;

	public void temp_record() {
		Temp tp = new Temp();
		
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
			PreparedStatement psmt = tp.con.prepareStatement(sql);
			psmt.setString(1, date);
			psmt.setInt(2, temp);

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

	public void monthly_view() {
		Temp tp = new Temp();
	
		ArrayList<Integer> avg = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("평균온도를 확인할 연, 월을 입력해주세요. ex.202104");
		String month = sc.nextLine();
		
		String sql = "select * " + "from temp";
		try {
			Statement st = tp.con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) { 
				String date_print = rs.getString("Date");
				int temp_print = rs.getInt("temp");
				
				String cutmonth = date_print.substring(0,6);
				
				if(month.equals(cutmonth)) {
					System.out.println("날짜: "+date_print);
					System.out.println("온도: "+temp_print);
					
					avg.add(temp_print);
					
					int size = avg.size();
					double sizes = (double) size;
					
					for (int i = 0; i < avg.size(); i++) {
						sum  += avg.get(i);

						double a = (double) sum;
						plus_sum = a/sizes;

					}
				}

			}
			System.out.println(avg);
			System.out.println("월 온도 합계: " + sum);
			System.out.println(month + "월의 평균온도: " + plus_sum + " degree");
            System.out.println("모든 값이 출력되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
