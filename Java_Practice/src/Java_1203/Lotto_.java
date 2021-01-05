package Java_1203;

import java.util.Scanner;

public class Lotto_ {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			double num1 = Math.random();
			double num2 = Math.random();
			double num3 = Math.random();
			double num4 = Math.random();
			double num5 = Math.random();
			double num6 = Math.random();
			
			int dice_1 = 40;
			
			System.out.println("첫번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int c = sc.nextInt();
			
			if(c==1) {
			int num_1 = (int)(dice_1*num1)+1; 
			System.out.println("첫번째 숫자: " +num_1);  //첫번째 숫자
			}
			
			System.out.println("두번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int b = sc.nextInt();
			
			if(b==1 ) {
			if(num1!=num2) {
				int num_2 = (int)(dice_1*num2)+1;
				System.out.println("두번째 숫자: " +num_2);  //두번째 숫자
			}
			
			System.out.println("세번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int d = sc.nextInt();
			
			if(d==1 ) {
			if(num1!=num3 && num2!=num3) {
				int num_3 = (int)(dice_1*num3)+1;
				System.out.println("세번째 숫자: " +num_3);    //세번째 숫자
			}
			System.out.println("네번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int e = sc.nextInt();
			
			if(e==1 ) {
			if(num1!=num4 && num2!=num4 && num3!=num4) {
				int num_4 = (int)(dice_1*num4)+1;
				System.out.println("네번째 숫자: " +num_4);    //네번째 숫자
			}
			System.out.println("다섯번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int f = sc.nextInt();
			
			if(f==1 ) {
			if(num1!=num5 && num2!=num5 && num3!=num5 && num4!=num5) {
				int num_5 = (int)(dice_1*num5)+1;
				System.out.println("다섯번째 숫자: " +num_5);    //다섯번째 숫자
			}
			System.out.println("여섯번째 숫자를 뽑습니다.");
			System.out.println("1.네, 2.아니오");
			int g = sc.nextInt();
			
			if(g==1 ) {
			if(num1!=num6 && num2!=num6 && num3!=num6 && num4!=num6 && num5!= num6) {
				int num_6 = (int)(dice_1*num6)+1;
				System.out.println("여섯번째 숫자: " +num_6);    //여섯번째 숫자
			}
				
			}
			}
	}
	}
}
}
}
}
