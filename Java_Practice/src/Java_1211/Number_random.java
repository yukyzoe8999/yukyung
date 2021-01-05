package Java_1211;

import java.util.Random;
import java.util.Scanner;

public class Number_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번 반복하시겠습니까?");
		int a = sc.nextInt();
		String array[] = new String[a];
		String aaa = "";

		for (int i = 0; i < a; i++) {
			int new_1 = random.nextInt(57) + 65;
			System.out.println("뽑힌 숫자는: " + new_1);
			if (new_1 >= 91 && new_1 <= 96) {
				i = -1;
				continue;
			}
			char c = (char) new_1;
			array[i] = Character.toString(c);

		}
		for (int i = 0; i < array.length; i++) {
			aaa = array[i];

		}
		System.out.println(aaa);

	}

}
