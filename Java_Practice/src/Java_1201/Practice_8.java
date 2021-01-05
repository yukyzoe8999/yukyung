package Java_1201;
import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int j = sc.nextInt();
			System.out.println("세번째 숫자를 입력하세요");
			int u = sc.nextInt();
			
			int k = i+j;
			int h = k-u;
			int y = h%5;
			int p = k+h;
			
			
			System.out.println(k);
			System.out.println(h);
			System.out.println(y);
			System.out.println(p);
		}
		
	}

}