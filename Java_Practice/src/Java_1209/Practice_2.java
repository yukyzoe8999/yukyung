package Java_1209;

import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 적어주세요.");
		int num_1 = sc.nextInt();
		System.out.println("두번째 숫자를 적어주세요.");
		int num_2 = sc.nextInt();
		int sum = 0;
		sum = num_1*num_2;

		if(sum%2==0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

	}

}
