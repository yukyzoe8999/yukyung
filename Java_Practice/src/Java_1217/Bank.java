package Java_1217;

import java.util.Scanner;

public class Bank {
	int balance = 10000;
	int draw = 0;
	int deposit = 0;
	int choice = 0;

	String card = "";

	public int bank(String card) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 조회 2. 출금 3. 입금");
		choice = sc.nextInt();
		return choice;
	}
	public int balance(int balance) {
		this.balance = balance;
			System.out.println("현재 잔액은: " + balance);
			
			return balance;	

	}
	public void draw(int draw) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("입금할 금액 입력");
			int choice_2 = sc.nextInt();
			this.draw = choice_2 + balance;

	}
	public void deposit(int deposit) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액 입력");
			int choice_3 = sc.nextInt();
			this.deposit = choice_3 + balance;
	}

}
