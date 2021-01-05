package Java_1202;

import java.util.Scanner;

public class If_practice1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
		}
		int a = 20;
		int b = 33;

		int k = a + b;

		if (k % 2 == 0) {
			System.out.println("짝수");
		}
		if ((k % 2) != 0) {
			System.out.println("홀수");
		}
		

	}

}
