package Java_1211;

import java.util.Scanner;

public class Calculator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("항 개수를 입력해주세요.");
		int i = sc.nextInt();
		int str[] = new int[i];
		int sum = 0;
		int j = 0;
		int k = 0;
		String str_1 = "";

		for (j = 0; j < i; j++) {

			System.out.println((j + 1) + "번째 숫자를 입력해주세요.");
			str[j] = sc.nextInt();
			if(j==i-1) {
				break;
			}
			System.out.println((k+1) + "번째 연산자 입력" + "+,-,*,/");
			String a = sc.next();
			str_1 = "";
		}
		if(str_1.equals("*")) {
			
		}

	}

}
