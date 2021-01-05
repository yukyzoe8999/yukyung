package Java_1207;

import java.util.Scanner;

public class F_practice {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("영문이름.");
			String str = sc.next();
			
			int sum=0;
				
		
			for (int str_1 = 0; str_1 < str.length(); str_1++) {
				
				char a = str.charAt(str_1);
				
				int b = a;
				
				sum += b;

			}
			System.out.println(sum);
			
			
		
			
			
		}
	}
}