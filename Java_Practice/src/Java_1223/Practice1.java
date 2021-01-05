package Java_1223;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String a = sc.nextLine();
		System.out.println("전화번호: ");
		String b = sc.nextLine();
		
		int leng = a.length();
		String sub []= new String[leng]; 
		
		String spt [] = b.split("-|\\+");
	
		
		for(int i = 0; i<leng;i++) {
			sub[i] = a.substring(i,i+1);
			
		}
		for (String k : sub) {
			System.out.println(k);
		}
		for (String k : spt) {
			System.out.println(k);
		}

	}

}
