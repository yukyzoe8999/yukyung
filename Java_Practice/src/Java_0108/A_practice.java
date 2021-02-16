package Java_0108;

import java.util.ArrayList;
import java.util.Scanner;

public class A_practice {

	public static void main(String[] args) {
		ArrayList<String> str_array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요.");
		String a = sc.nextLine();
		
		for(int i=0; i<a.length();i++) {
			str_array.add(a.substring(i,i+1));
		}
		int b = str_array.size()/2;
		
		for(int i=0;i<=b;i++) {
			str_array.remove(0);
			i++;
			System.out.println(str_array);
		}
		//str_array.remove(str_array.size()/2);
		
	    System.out.println(str_array);
		System.out.println(str_array.size());
	    System.out.println(str_array.size()/2);

	}

}
