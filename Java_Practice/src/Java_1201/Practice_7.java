package Java_1201;
 import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("첫번째 숫자를 입력하세요.");
			int i = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.");
			int j = sc.nextInt();
			System.out.println("세번째 숫자를 입력하세요");
			int u = sc.nextInt();
			
			int b = i*j;
			double v = ((double)u/(double)b)*100;
			int g = (int)v;
			
			
			System.out.println("퍼센트" + v +"%");
			System.out.println(g);
		}

	}

}
