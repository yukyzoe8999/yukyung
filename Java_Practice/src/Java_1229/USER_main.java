package Java_1229;

import java.util.Scanner;

public class USER_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USER use = new USER();

		setting(use);
		use.getID();
		use.getNAME();
		use.getPASS();

	}

	public static void setting(USER use) {
		String ID = "ID";
		String NAME = "이름";
		int PASS = 0;

		use.setID(scan(ID));
		use.setNAME(scan_n(NAME));
		use.setPASS(scan_num(PASS));
	}

	public static String scan(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a + "입력");
		String i;
		do {
			i = sc.nextLine();
			if (i.length() > 6 || i.length() < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while (i.length() > 6 || i.length() < 0);
		return i;

	}

	public static String scan_n(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a + "입력");
		String i;

		do {
			i = sc.nextLine();
			if (i.length() > 4 || i.length() < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while (i.length() > 4 || i.length() < 0);
		return i;

	}

	public static String scan_num(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 입력");
		String i = Integer.toString(a);
		do {
			i = sc.nextLine();			
			if (i.length() > 8 || i.length() < 0) {
				System.out.println("잘못입력하셨습니다.");
			}
		} while (i.length() > 8 || i.length() < 0);
		return i;

	}

}
