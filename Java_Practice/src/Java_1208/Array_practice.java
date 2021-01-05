package Java_1208;

import java.util.Scanner;

public class Array_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String a = sc.nextLine();
		String c[] = a.split(" ");
		// System.out.println(c.length);

		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]);

			int leng = c[i].length();
			// System.out.println(leng);

			for (int j = 0; j < leng; j++) {
				String sub = c[i].substring(j, j + 1);
				System.out.println(sub);
			}

		}

	}
}