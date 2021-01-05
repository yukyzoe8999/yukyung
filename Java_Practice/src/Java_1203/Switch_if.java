package Java_1203;

import java.util.Scanner;

public class Switch_if {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int num = sc.nextInt();
			if(num>10||num<0) {
				System.out.println("잘못입력하셨습니다");
			}
			else {
				System.out.println("두번째 숫자를 입력하세요.");
				int num_2 = sc.nextInt();
				if(num_2>10||num_2<0) {
					System.out.println("잘못입력하셨습니다");
				} else { 
					System.out.println("어떤 연산자를 입력하시겠습니까.");
					System.out.println("1.+. 2.-, 3.*, 4./"); }

				int num_3 = sc.nextInt();
				String num_1 = "";

				if((num_3 !=1)||(num_3 !=2)||(num_3 !=3)||(num_3!=4)) {

					System.out.println("실행안함");}
				else {System.out.println(num_1 +"연산을 하겠습니다"); 
				}

				double a = (double) num;
				double b = (double) num_2;

				switch (num_3) {
				case 1:
					num_1 = "+";
					System.out.println(num + "+" + num_2 + "=");
					System.out.println(num + num_2);
					break;
				case 2:
					num_1 = "-";
					System.out.println(num + "+" + num_2 + "=");
					System.out.println(num -num_2);
					break;
				case 3:
					num_1 = "*";
					System.out.println(num + "+" + num_2 + "=");
					System.out.println(num * num_2);
					break;
				case 4:
					num_1 = "/";
					System.out.println(a + "/" + b + "=");
					System.out.println(a / b);
					break;

				}

			}

		}


	}
}


