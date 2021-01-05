package Java_1210;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number[] = { "1", "2", "3", "4" };
		System.out.println("적으세요.");
		String str = sc.nextLine();
		int leng = str.length();
		String str_array[] = new String[leng];
		
		
		for(int i =0; i<leng;i++) {
			str_array[i] = str.substring(i,i+1);
		}

		int cnt = 0;
		for (int i = 0; i < leng; i++) {
			for (int j = 0; j < number.length; j++) {
				if ((!str_array[i].equals(number[j]))) {
					cnt++;
					System.out.println(cnt);
				}
			}if(cnt<=9) {
				cnt = 0;
			}else if (cnt==10) {
				System.out.println("너 숫자입력");
				break;
			}

		}

	}
}
