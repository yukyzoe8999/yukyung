package Java_1208;

import java.util.Scanner;

public class Bank_ {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 1. 입금(무제한) 2. 출금(잔액이 0일때는 출금x) 3.조회(현재잔고확인, 잔액확인)

		boolean open = true;

		String name = "";

		int in = 0; // 입금

		int out = 0; // 출금

		int balance = 0; // 잔액

		while (open) {

			Scanner sc = new Scanner(System.in);

			System.out.println("어떤 업무를 보시겠습니까?\n " + "1. 입금 2. 출금 3. 잔액조회");

			int ask = sc.nextInt();

			switch (ask) {

			case 1:

				name = "입금";

				System.out.println("액수를 입력해주세요.");

				int in_2 = sc.nextInt();

				balance = balance + in_2;

				System.out.println(in_2 + "원을 입금하셨습니다.\n " + "현재 잔액은" + balance + "입니다.");

				System.out.println(name + "업무를 정상적으로 처리하였습니다.");

				break;

			case 2:

				name = "출금";

				System.out.println("액수를 입력해주세요.");

				int out_2 = sc.nextInt();

				if (balance < out || balance <= 0) {

					System.out.println("출금할 잔액이 부족합니다. 잔고를 확인해주세요.");

				} else {

					balance = balance - out_2;

					System.out.println(out_2 + "원을 출금하셨습니다.\n " + "현재 잔액은" + balance + "입니다.");

					System.out.println(name + "업무를 정상적으로 처리하였습니다.");

				}

				break;

			case 3:

				name = "잔액조회";

				System.out.println("조회하실 계좌를 입력해주세요.");

				int account = sc.nextInt();

				System.out.println("현재 계좌의 잔액은" + balance);

				System.out.println(name + "업무를 정상적으로 처리하였습니다.");

				break;

			}

			System.out.println("계속해서 거래하시겠습니까? \n " + "1. 네 2. 아니오.");

			int re = sc.nextInt();

			if (re == 1) {

				open = true;

			} else if (re == 2) {

				open = false;

				System.out.println("이용해주셔서 감사합니다.");

			}

		}

	}

}
