package DAY_2_2.copy;

import java.util.Scanner;

public class Temp_Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		TempDAO td = new TempDAO();

		boolean b = true;

		while (b) {
			System.out.println("1.온도 기록 || 2. 월별 온도조회 || 3. 끝내기");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				td.temp_record();
				break;
			case 2:
				td.monthly_view();
				break;
			case 3:
				System.out.println("온도 시스템 나가기");
				b = false;
				break;
			}
		}
	}

}
