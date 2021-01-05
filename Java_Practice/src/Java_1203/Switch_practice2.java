package Java_1203;

import java.util.Scanner;

public class Switch_practice2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int num = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int num_2 = sc.nextInt();
			System.out.println("어떤 연산자를 입력하시겠습니까.");
			System.out.println("1.+. 2.-, 3.*, 4./");
			int num_3 = sc.nextInt();
			

			switch (num_3) {
			case 1:
				
				System.out.println(num + "+" + num_2 + "=");
				System.out.println(num + num_2);
				break;
			case 2:
			
				System.out.println(num + "+" + num_2 + "=");
				System.out.println(num - num_2);
				break;
			case 3:
				
				System.out.println(num + "+" + num_2 + "=");
				System.out.println(num * num_2);
				break;
			case 4:
			
				System.out.println(num + "+" + num_2 + "=");
				System.out.println(num / num_2);
				break;
			}

		}

	}
}
