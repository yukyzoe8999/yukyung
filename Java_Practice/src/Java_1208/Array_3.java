package Java_1208;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String b = n.nextLine();
		String c[] = b.split("@");
		System.out.println(c.length);
		System.out.println(c[0]);
		System.out.println(c[1]);

	//	for (int i = 0; i < c.length; i++){
			//System.out.println(c[i]);

		}
	}
//}