package Java_1204;

import java.util.Scanner;

public class Sub_practice2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("뮨자를 적으세요.");
			String str = sc.next();

			for (int i = 0; i < str.length(); i++) {
				//System.out.println(str.substring(i, i + 1));
				String a = str.substring(i, i + 1);
				
				if (a.equals("#") || a.equals("?") || a.equals("!")) {
					
					if(a.equals("#")) {
						System.out.println("#을(를) 잘못 입력하셨습니다.");
					} 
					if( a.equals("?")) {
						System.out.println("?을(를) 잘못 입력하셨습니다.");
					}
					if(a.equals("!")) {
						System.out.println("!을(를) 잘못 입력하셨습니다.");
					}

				} else {System.out.println(str.substring(i, i + 1));}
			}

		}
	}
}