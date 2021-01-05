package Java_1207;

import java.util.Scanner;

public class Car_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean car = true;
		int car_flag = 0;
		boolean car_car = true;
		int car_car_flag = 0;

		String car_name = "";

		
		int speed = 0;
		int inc = 0;
		int dec = 0;
		int max = 0;

		while (car) {
			
			System.out.println("자동차를 선택하세요. \n" + "1. Porchee 2.Benz 3.Sonata");
			int car_k = sc.nextInt();

			switch (car_k) {
			case 1:
				car_name = "Porchee";
				inc = 10; // 증가
				dec = 10; // 감소
				max = 200;
				System.out.println(car_name + "는" + inc + "만큼 속력이 증가하고" + dec + "만큼 속력이 감소합니다.");
				break;
			case 2:
				car_name = "Benz";
				inc = 8; // 증가
				dec = 8; // 감소
				max = 300;
				System.out.println(car_name + "는" + inc + "만큼 속력이 증가하고" + dec + "만큼 속력이 감소합니다.");
				break;

			case 3:
				car_name = "Sonata";
				inc = 5; // 증가
				dec = 5; // 감소
				max = 250;
				System.out.println(car_name + "는" + inc + "만큼 속력이 증가하고" + dec + "만큼 속력이 감소합니다.");
				break;
			}

			System.out.println("차를 선택하셨습니다.");
			System.out.println("진행하시겠습니까?" + "1. yes. 2.no.");
			car_flag = sc.nextInt();

			switch (car_flag) {

			case 1:
				car = false;
				System.out.println("계속 진행합니다.");
				break;
			case 2:
				car = true;
				break;
			}
		}
			while (car_car) {

				System.out.println("속력을 높이시겠습니까? \n" + "1. 높힌다. 2.줄인다.");
				int num_1 = sc.nextInt();

				switch (num_1) {
				case 1:
					speed = speed + inc;

					if (speed > max) {
						System.out.println("최고속도 입니다.");
						speed = max;
						System.out.println("현재속도는: " + speed);
					} else {
						System.out.println("현재속도는: " + speed);

					}
					break;
				case 2:
					speed = speed - dec;
					if (speed <= 0) {
						System.out.println("멈추었습니다.");
						speed = 0;
						
					} else {
						System.out.println("현재속도는: " + speed);

					}
					break;

				}
			}
		}
	}
