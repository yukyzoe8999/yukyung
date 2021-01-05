package Java_1230_test;

import java.util.Scanner;

public class Coding_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int number = 0;
		int plus = 0;
		int min = 0;
		int mul = 0;
		int divi = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 받으시겠습니까?");
		int num = sc.nextInt();
		for(int i =1; i<=num; i++) {
			System.out.println(i+"번째 숫자를 입력하세요.");
			number = sc.nextInt();
			plus+=number;
			min-=number;
			mul*=number;
			divi/=number;
		}
		System.out.println("연산자를 선택하세요.\n "+"1.+ 2.- 3.* 4./");
		int code = sc.nextInt();
		if(code==1)	{
			sum =plus;
		} else if(code==2) {
			sum = min;
		}else if(code==3) {
			sum = mul;
		}else if(code==4) {
			sum = divi;
		} System.out.println(sum);
	}
}
