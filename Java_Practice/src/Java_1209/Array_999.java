package Java_1209;

import java.util.Scanner;

public class Array_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean aa = true;
		int sum = 0;
		String array [] = new String[10];
		String array_1 = "";
		

		while (aa) {
			System.out.println("첫번째 숫자를 적으세요.");
			int num_1 = sc.nextInt();
			System.out.println("두번째 숫자를 적으세요.");
			int num_2 = sc.nextInt();
			System.out.println("연산자를 고르세요.\n " + "+, -, *, /");
			String code = sc.next();

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
			System.out.println(num_1 + code + num_2 + "=" + sum);
			System.out.println("계속해서 연산 하시겠습니까?\n " + "1.네 2. 아니오.");
			int num_4 = sc.nextInt();

			if (num_4 == 1) {
				aa = true;
			} else if (num_4 == 2) {
				aa = false;
				System.out.println("연산을 마칩니다.");
			}
			

		}

	}

}
