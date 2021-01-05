package Java_1208;

import java.util.Scanner;

public class Bank_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 입금(무제한) 2. 출금(잔액이 0일때는 출금x) 3.조회(현재잔고확인, 잔액확인)

		boolean open = true;

		String name = "";

		int in = 0;
		int out = 0;

		int balance = 5000;
		int ask_2 = 0;

		while (open) {
			boolean open_start = true;
			
			Scanner sc = new Scanner(System.in);

			while (open_start) {
				System.out.println("어떤 업무를 보시겠습니까?\n " + "1. 입금 2. 출금 3. 조회");
				int ask = sc.nextInt();

				switch (ask) {
				case 1:
					name = "입금";
					

					break;

				case 2:
					name = "출금";
					

					break;
				case 3:
					name = "조회";
					

					break;
				}

				System.out.println("액수를 입력해주세요.");
				ask_2 = sc.nextInt();

				if (name.equals("입금")) {

					in =  in+ ask_2;
					System.out.println(ask_2 + "원을 입금하셨습니다.\n " + "현재 잔액은" + in + "입니다.");

				} else if (name.equals("출금")) {

					out = balance -ask_2;

					if (balance < ask_2) {
						System.out.println("출금할 잔액이 부족합니다.");

					} else {
						System.out.println(ask_2 + "원을 출금하셨습니다.\n " + "현재 잔액은" + in + "입니다.");
					}
				} else if (name.equals("조회")) {

					balance = in + out;
					System.out.println("현재 잔액은" + balance + "입니다.");

				}

			}

		}
	}
}
