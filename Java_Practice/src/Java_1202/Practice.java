package Java_1202;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		try ( // TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int j = sc.nextInt();
			System.out.println("세번째 숫자를 입력하세요");
			int k = sc.nextInt();
			System.out.println("네번째 숫자를 입력하세요");
			int g = sc.nextInt();

			int t = i + j;
			int r = k - g;
			int f = t * r;

			System.out.println(t);
			System.out.println(r);
			System.out.println(f);

		}

	}

}
