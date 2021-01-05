package Java_1207;

import java.util.Scanner;

public class Car_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean car = true;
		int speed = 0;

		while (car) {
			Scanner sc = new Scanner(System.in);
			System.out.println("선택하세요. \n" + "1.가속 2.감속 3.중지");
			int car_c = sc.nextInt();

			if (car_c == 1) {
				speed++;
				System.out.println("속도:" + speed);
			} else if (car_c == 2) {
				speed--;
				System.out.println("속도:" + speed);
			} else if (car_c == 3) {
				System.out.println("차가 멈추었습니다.");
				car = false;
			}
		}

	}
}


