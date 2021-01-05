package Java_0104;

import java.util.Scanner;

import Java_0104_2.Exam;

public class AA {

	public static void main(String[] args) {
		CC list = new CC();
		list.ArrayC = new BB[3];
		list.current = 0;

		boolean b = true;
		while (b) {
			input(list);
			print(list);
		}

	}

	public static void print(CC list) {
		for (int i = 0; i < list.current; i++) {
			BB PtintB = list.ArrayC[i];

			int num1 = PtintB.num1;
			int num2 = PtintB.num2;
			int num3 = PtintB.num3;

			int sum = num1 + num2 + num3;

			System.out.println("첫번째 숫자: " + num1);
			System.out.println("두번째 숫자: " + num2);
			System.out.println("세번째 숫자: " + num3);
			System.out.println("합은: " + sum);

		}
	}

	public static void input(CC list) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자 입력");
		num3 = sc.nextInt();

		BB newB = new BB();

		newB.num1 = num1;
		newB.num2 = num2;
		newB.num3 = num3;

		if (list.ArrayC.length == list.current) {
			BB[] temp = new BB[list.ArrayC.length + 5];
			for (int i = 0; i < list.ArrayC.length; i++) {
				temp[i] = list.ArrayC[i];

			}
			list.ArrayC = temp;
		}

		list.ArrayC[list.current] = newB;
		list.current++;

	}

}
