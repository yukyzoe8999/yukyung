package Java_1209;

import java.util.Scanner;

public class Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자(+특수기호)를 입력하세요.");
		String str = sc.nextLine();
		String str_1[] = str.split("!| |\\?");
		System.out.println(str_1.length);

		for (int i = 0; i < str_1.length; i++) {
			System.out.println(str_1[i]);
		}

	}

}
