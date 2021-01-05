package Java_1202;

import java.util.Scanner;

public class If_practice4 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("액수를 입력하시오.");
			int bill = sc.nextInt();
			int bill_1 = 0;
			


			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;


			a = bill/500;
			bill_1 = bill%500;
			b = bill_1/100;
			bill_1 = bill_1%100;
			c = bill_1/50;
			bill_1 = bill_1%50;
			d = bill_1/10;
			bill_1 = bill_1%10;


			System.out.println("오백원짜리" +a);
			System.out.println("백원짜리" +b);
			System.out.println("오십원짜리" +c);
			System.out.println("십원짜리" +d);
			System.out.println("나머지" +bill_1);














		}
	}
}



