package Java_1210;

import java.util.Scanner;

public class Array_morse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String str = sc.nextLine();
		char a =' ';
		char b =' ';
		String sub = "";
		
		//String array[] = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			a = str.charAt(i);			
			int num = a;
							
			//System.out.println(num);
			String tran = Integer.toBinaryString(num);
			System.out.println(tran);
						
			
			for(int j =0; j<tran.length();j++) {
				b = tran.charAt(j);				
				System.out.println(b);			
				
				if(b=='1') {		
					sub = "-";
					System.out.println(sub);
				}
				if(b=='0') {
					sub = ".";
					System.out.println(sub);
				}
				
			}
			
			
		}
		

	}

}
