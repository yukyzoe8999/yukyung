package Java_0104;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		B arrayA []= new B[3];
		input(arrayA);
		print(arrayA);
		

	}
	public static void print(B arrayA []) {
		for(int i =0;i<3;i++) {
			B PtintB = arrayA[i];
			
			int num1 = PtintB.num1;
			int num2 = PtintB.num2;
			int num3 = PtintB.num3;
			
			int sum = num1+num2+num3;
			
			System.out.println("첫번째 숫자: "+num1);
			System.out.println("두번째 숫자: "+num2);
			System.out.println("세번째 숫자: "+num3);
			System.out.println("합은: "+sum);

		}
	}
	public static void input(B arrayA []) {
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			System.out.println("첫번째 숫자 입력");
			num1 = sc.nextInt();
			System.out.println("두번째 숫자 입력");
			num2 = sc.nextInt();
			System.out.println("세번째 숫자 입력");
			num3 = sc.nextInt();
			
			
			B newB = new B();   //for문 안에서 꼐속 초기화 됨
			
			newB.num1 = num1;
			newB.num2 = num2;
			newB.num3 = num3;
			
			arrayA[i] = newB;
		}
		
		
				
	}

}
