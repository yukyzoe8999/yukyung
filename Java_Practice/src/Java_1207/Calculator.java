package Java_1207;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		while (run) {

			System.out.println("첫번째 숫자를 입력해주세요.");
			int num_1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력해주세요.");
			int num_2 = sc.nextInt();
			System.out.println("어떤 연산을 하시겠습니까? \n" + " +,  -,  *,  /");
			String code = sc.next();
			int sum = 0;
			
			switch (code) {
			case ("+"):
				sum = num_1 + num_2;
				break;
			case ("-"):
				sum = num_1 - num_2;
				break;
			case ("*"):
				sum = num_1 + num_2;
				break;
			case ("/"):			
				sum = num_1 / num_2;
				break;
			}
			if (code.equals("+") || code.equals("-") || code.equals("*")) {
				System.out.println(num_1 + code + num_2 + "=" + sum);
				System.out.println("계속하시겠습니까?\n " + "1. yes 2. no");
				int flag = sc.nextInt();
				if (flag == 1) {
					run = true;
				} else {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
			} else if (code.equals("/")) {
				double sum_1 = (double)num_1 /(double)num_2 ;
				System.out.println(num_1 + code + num_2 + "=" + sum_1);
				System.out.println("계속하시겠습니까?\n " + "1. yes 2. no");
				int flag = sc.nextInt();
				if (flag == 1) {
					run = true;
				} else {
					run = false;
					System.out.println("계산을 종료합니다.");
				}
			}

		}

	}
}
