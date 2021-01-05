package Java_1230_test;

import java.util.Random;
import java.util.Scanner;

public class Coding_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int i = sc.nextInt();
		for (int j = 1; j <= i; j++) {
			sum += j;
			System.out.println("정수의 합: "+sum);
		}
		Random rdm = new Random();
		
		int a = rdm.nextInt(10);
		System.out.println("랜덤 숫자: "+a);
		
		int b = sum*a;
		System.out.println("정수의 합과 랜덤 숫자의 곱: "+b);

	}
}
