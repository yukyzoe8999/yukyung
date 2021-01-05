package Java_0104;

import java.util.Scanner;

public class CCC {
	BBB b = new BBB();
	
	public static void out(BBB b) {
		
	}
	
	public static void scan(BBB b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네자리 숫자 입력");
		b.str = sc.nextLine();
		
		System.out.println("한자리 숫자 입력");
		b.a = sc.nextInt();
	

	}
	public static void print(BBB b) {	
		//System.out.println("ddd : " + b.str);
		String s[] = new String[4];
		for (int i = 0; i < b.str.length(); i++) {
			s[i] = b.str.substring(i, i + 1);
			String a = s[i];
			//System.out.println(a);
			int k = Integer.parseInt(a);
			System.out.println(k);
			int sum=0;
			sum+=k;
			
		}
		

	}

}
