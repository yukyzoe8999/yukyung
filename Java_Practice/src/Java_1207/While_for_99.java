package Java_1207;

import java.util.Scanner;

public class While_for_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("단을 입력하세요.");
			int a = sc.nextInt();
			for (int i = a; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + i * j);
				}
				System.out.println("계속하시겠습니까?\n " + "1. yes 2. no");
				int out = sc.nextInt();
				if (out == 1) {
					run = true;
				} else {
					run = false;
				}
			}

		}

	}

}
