package Java_1215;

import java.util.Scanner;

public class Review_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요.");
		String a = sc.nextLine();
		int aa = length(a); // 길이
		String str[] = new String[aa];
		str = sub(aa, a);
		print(str);
	}


	public static int length(String a) {
		// TODO Auto-generated method stub
		int length = a.length();
		return length;
	}

	public static String[] sub(int aa, String a) {
		String str[] = new String[aa];
		for (int i = 0; i < aa; i++)		{
			str[i] = a.substring(i, i + 1);
		}
		return str;

	}
	public static void print(String[] str) {
		// TODO Auto-generated method stub
		for(String k : str) {
			System.out.println(k);
		}
	}
}
