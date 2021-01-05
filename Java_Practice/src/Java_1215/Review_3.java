package Java_1215;

import java.util.Random;
import java.util.Scanner;

public class Review_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int a = sc.nextInt();
		
		Random rdm = new Random();
		int dice = rdm.nextInt(a);
		int dice_2 = roll(dice, a);
		System.out.println(dice_2);

	}

	public static int roll(int dice, int a) {
		// TODO Auto-generated method stub
		Random rdm = new Random();
		int dice_2 = rdm.nextInt(a);		
		return dice_2;
	}


}
