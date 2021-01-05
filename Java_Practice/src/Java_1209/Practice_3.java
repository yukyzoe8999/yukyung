package Java_1209;

import java.util.Scanner;

public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력.");
		String str = sc.nextLine();
		String str_1 = str + "";
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			//System.out.println(str.length()-i); 짝수는 -2씩해서 1이 나오지 않음. 홀수는 -2씩해서 1이 남음.
			if (str.length()-i != 1) {
				String txt = str.substring(i, i + 2);
				i++;
				System.out.println(txt);
				
			} else {
				String txt_1 = str_1.substring(i, i + 1);
				i++;
				System.out.println(txt_1);
			}
		}

	}
}
