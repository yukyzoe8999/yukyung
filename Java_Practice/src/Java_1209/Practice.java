package Java_1209;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 문자를 적어주세요.");
		String txt_1 = sc.nextLine();
		System.out.println("두번째 문자를 적어주세요.");
		String txt_2 = sc.nextLine();

		System.out.println("두 글자를 비교하시겠습니까?\n " + "1. 네 2. 아니오");
		int a = sc.nextInt();

		while (a == 1) {

			if (txt_1.equals(txt_2)) {
				System.out.println("두 글자가 같습니다.");
				
			} else {
				System.out.println("두 글자가 다릅니다.");
			
			}

		}

	}
}
