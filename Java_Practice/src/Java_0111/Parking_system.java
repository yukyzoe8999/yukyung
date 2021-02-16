package Java_0111;

import java.util.Scanner;

public class Parking_system {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Parking park = new Parking();
		boolean b = true;

		while (b) {
			System.out.println("1.주차 2. 주차정보 확인 3. 요금 계산");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				park.input();
				break;
			case 2:
				park.print_info();
				break;
			case 3:
				break;
			}
		}

	}
}
