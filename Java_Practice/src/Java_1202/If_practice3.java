	package Java_1202;
import java.util.Scanner;
public class If_practice3 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int j = sc.nextInt();
			
			
			int k = i+j;
		
			
			if(k>50 || k<=60) {
				System.out.println(k%3);
			}
			else if(k>60 || k<=100 ) {
				System.out.println(k%6);
			}
			else if(k>100) {
				int p = 2;
				System.out.println(k%p);
		
		    }
		   
		 }
		}

	}