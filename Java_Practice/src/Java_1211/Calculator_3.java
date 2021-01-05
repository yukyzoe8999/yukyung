package Java_1211;

import java.util.Scanner;

public class Calculator_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int sum = 0;
		int num_2 = 0;
		int aaa = 0;
	
		while (run) {
				
				if (aaa==0) {
					System.out.println("1,2,3,4,5,6,7,8,9,0");
					int num = sc.nextInt();
					sum =num;
				}else{						
					System.out.println("+,-,*,/,=");
					String str = sc.next();
					if (str.equals("+")) {
						System.out.println("1,2,3,4,5,6,7,8,9,0");
					    num_2 = sc.nextInt();
						sum += num_2;
					} else if (str.equals("-")) {
						System.out.println("1,2,3,4,5,6,7,8,9,0");
					    num_2 = sc.nextInt();
						sum -= num_2;
					} else if (str.equals("*")) {
						System.out.println("1,2,3,4,5,6,7,8,9,0");
					    num_2 = sc.nextInt();
						sum *= num_2;
					} else if (str.equals("/")) {
						System.out.println("1,2,3,4,5,6,7,8,9,0");
					    num_2 = sc.nextInt();
						sum /= num_2;
					} else {
						run = false;
					}
					System.out.println("="+sum);
					

				}aaa++;
				
			} 

		}

	}

