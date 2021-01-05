package Java_1210;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자선택\n " +"1부터 9까지");
		int num = sc.nextInt();
		
		Random random = new Random();
		int dice = random.nextInt(9)+1;
		System.out.println(dice);
		
		int speed = 0;
		
		int num_2 = random.nextInt(50)+100;
		
		//System.out.println(num_2);
		if(num_2>=100&&num_2<110) {
			if(num==dice) {
				System.out.println("안타입니다.");
				System.out.println("속도는"+num_2+"입니다.");
			} else {
				System.out.println("안타가 아닙니다");
				System.out.println("속도는"+num_2+"입니다.");
			}
		} else if(num_2>110&&num_2<130) {
			if(num==dice) {
				System.out.println("안타입니다.");
				System.out.println("속도는"+num_2+"입니다.");
			} else {
				System.out.println("안타가 아닙니다");
				System.out.println("속도는"+num_2+"입니다.");
			}
		} else if(num_2>130&&num_2<150) {
			if(num==dice) {
				System.out.println("안타입니다.");
				System.out.println("속도는"+num_2+"입니다.");
			} else {
				System.out.println("안타가 아닙니다");
				System.out.println("속도는"+num_2+"입니다.");
			}
			
		}
	
		
		
		
		

	}

}
