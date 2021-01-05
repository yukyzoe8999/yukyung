package Java_1231;

import java.util.Scanner;

public class Account_main {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1. 계좌생성 | 2.계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("-----------------------");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		} System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		System.out.println("계좌를 생성해 주세요.");	
		String account = sc.nextLine();
		
		System.out.println("계좌생성: ");
		String ano = sc.next();
		
		System.out.println("이름: ");
		String owner = sc.next();
		
		System.out.println("초기 입금액: ");
		int balance = sc.nextInt();
		
		
	}

	private static void accountList() {
		System.out.println("계좌 목록:");
	}

	private static void deposit() {
		System.out.println("맡기실 금액을 입력해주세요.");
		int put = sc.nextInt();
	
	}

	private static void withdraw() {
		System.out.println("출금하실 금액을 입력해주세요.");
		int out = sc.nextInt();
	}

	//private static Account findAccount(String ano) {
		
		

	//}

}
