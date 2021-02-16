package Java_0106;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {

		Rentcar_system open = new Rentcar_system();
		Scanner sc = new Scanner(System.in);

		boolean b = true;

		while (b) {
			System.out.println("1. 렌트 2. 렌트 확인 ");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				open.input();
				break;
			case 2:
				open.print();
				break;
			}
		}

	}

}
