package Java_1210;

import java.util.Scanner;

public class Array_morse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String str = sc.nextLine();
		char a =' ';
		String aa = "";
		String bb = "";
		for(int i=0; i<str.length(); i++) {
			
			a = str.charAt(i);
			int num = a;
		
			//System.out.println(num);
			String tran = Integer.toBinaryString(num);
			System.out.println(tran);
			
			if(tran.contains("1")||tran.contains("0")) {
				tran = tran.replace("0", ".");
				tran = tran.replace("1", "-");
				//aa=".";
				//bb="-";
				System.out.println(tran);
				
			} 
		}
		

	}

}
