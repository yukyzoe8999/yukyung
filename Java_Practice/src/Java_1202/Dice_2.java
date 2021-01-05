package Java_1202;

import java.util.Scanner;

public class Dice_2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("주사위를 골라주세요");
			int num_1 = sc.nextInt();
			System.out.println("주사위를 골라주세요");
			int num_2 = sc.nextInt();
			System.out.println(num_1 +"면체 주사위를 굴립니다.");
			System.out.println(num_2 +"면체 주사위를 굴립니다.");

			int sum = 0;

			double dice_1 = Math.random();
			double dice_2 = Math.random();

			int dice_num_1 =(int)(dice_1*num_1)+1;
			int dice_num_2 =(int)(dice_2*num_2)+1;

			if(dice_num_1>num_1 || dice_num_2>num_2 ) { 
				dice_num_1 = (dice_num_1-1);
				dice_num_2 = (dice_num_2-1);
				sum = dice_num_1 + dice_num_2;
				System.out.println("첫번째 주사위 값은" + dice_num_1);
				System.out.println("두번째 주사위 값은" + dice_num_2);
			}

			else {
				sum = dice_num_1 + dice_num_2;
				System.out.println("첫번째 주사위 값은" + dice_num_1);
				System.out.println("두번째 주사위 값은" + dice_num_2);
			}

			System.out.println("주사위의 합은" + sum);
		}
	}
}




