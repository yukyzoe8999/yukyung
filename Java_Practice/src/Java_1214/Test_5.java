package Java_1214;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
	    String a = sc.nextLine();
	   
	    
	    boolean b = newc(a);
	    int idx = string_idx(a);
	    
	    if(b==true) {
	    	System.out.println("인덱스 값: "+ idx);
	    } else {
	    	System.out.println("!표가 없습니다.");
	    }
	} public static boolean newc(String a) {
		// TODO Auto-generated method stub
		boolean aa = a.contains("!");
		return aa;
		
	}public static int string_idx(String a) {
		// TODO Auto-generated method stub
		int idxx = a.indexOf("!");
		return idxx;
	}
	
		
		
	}


