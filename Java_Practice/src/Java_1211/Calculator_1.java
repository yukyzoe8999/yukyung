package Java_1211;

import java.util.Scanner;

public class Calculator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("항 개수를 입력해주세요.");
		int i = sc.nextInt();
		int str[] = new int[i];
		int sum = 0;
		int j = 0;

		for (j = 0; j < i; j++) {

			System.out.println((j + 1) + "번째 숫자를 입력해주세요.");
			str[j] = sc.nextInt();

		}
		System.out.println("연산자 입력" + "+,-,*,/");
		String a = sc.next();

		if (a.equals("+")) {
			for (j = 0; j < str.length; j++) {
				sum += str[j];
			}
		} else if (a.equals("-")) {
			for (j = 0; j < str.length; j++) {
				if (j == 0) {
					sum = str[j];
				} else {
					sum -= str[j];
				}
			}
		} else if (a.equals("*")) {
			for (j = 0; j < str.length; j++) {
				if (j == 0) {
					sum = str[j];

				} else {
					sum *= str[j];
				}
			}

		} else if (a.equals("/")) {
			for (j = 0; j < str.length; j++) {
				if (j == 0) {
					sum = str[j];

				} else {
					sum /= str[j];
				}
			}
		}
		System.out.println(sum);

	}
}
