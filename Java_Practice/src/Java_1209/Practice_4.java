package Java_1209;

import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("적으세요.");
		String str = sc.nextLine();
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.contains("0") || str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4")
					|| str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8")
					|| str.contains("9")) {
				// String str_1 = str.substring(i,i+1);
				// System.out.println(str_1);
				char c = str.charAt(i);				
				int a = c;	
				
				System.out.println(a);
				
			    System.out.println(sum);
								

			} else {
				System.out.println("숫자가 아닙니다.");
			}

		}

	}
}
