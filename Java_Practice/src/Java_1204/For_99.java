package Java_1204;

import java.util.Scanner;

public class For_99 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("몇단?");
			int dan = sc.nextInt();

			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);

			}

		}
	}
}
