package Java_1202;

import java.util.Scanner;

public class Dallor {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("내가 바꿀 돈");
			 int won = sc.nextInt();
			 
			 double dollar = (double)won/1101.80;
					 
			 
			 System.out.println("달러: " +dollar);
			 
		}
	}
}
			