package Java_1202;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("연도를 입력하세요");
			 int year = sc.nextInt();
			
			 
			 
			 
			 
			 if(year%4==0 && year%100 !=0) {
				 System.out.println("윤년");
				
			 }
			 else if(year%400==0) {
				 System.out.println("윤년");
			 }
			 else {
				 System.out.println("윤년이 아니다");
			 }
			 
			 
			 
					 
	}
		

}
}
