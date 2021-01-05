package Java_1230_test;

import java.util.Scanner;

public class Number_final_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_final plan = new Number_final();
		Scanner sc = new Scanner(System.in);
		System.out.println("성함: ");
		plan.setName(sc.nextLine());
		System.out.println("번호: ");
		plan.setNo(sc.nextLine());

		System.out.println("성함: " + plan.getName());
		System.out.println("번호: " + plan.getNo());
		System.out.println("발권이 완료되었습니다.");
		System.out.println("비행을 시작합니다.");
		
		
     	plan.to();
		

	}

}
