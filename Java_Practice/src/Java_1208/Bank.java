package Java_1208;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 입금(무제한) 2. 출금(잔액이 0일때는 출금x) 3.조회(현재잔고확인, 잔액확인)
		

		boolean open = true;
		

		String name = "";

		int in = 0;
		int out = 0;
		int check = 0;
		int balance = 0;

		while (open) {
			boolean open_start = true;
			boolean in_out = true;
			Scanner sc = new Scanner(System.in);
			
			while (open_start) {				
				System.out.println("어떤 업무를 보시겠습니까?\n " + "1. 입금 2. 출금 3. 조회");
				int ask = sc.nextInt();

				switch (ask) {
				case 1:
					name = "입금";
					in = 0;
					break;
				case 2:
					name = "출금";
					out = 0;

					break;
				case 3:
					name = "조회";
					check = 0;

					break;
				}

				System.out.println(name + "업무를 진행하시겠습니까?\n " + "1. 네 2. 아니오");
				int open_close = sc.nextInt();

				switch (open_close) {
				case 1:
					open_start = false;
					break;
				case 2:
					open_start = true;
					System.out.println("처음으로 돌아갑니다.");
					break;
				}
			}
			while(in_out) {
				
				
				System.out.println("입금할 금액을 입력해주세요.");
				int ask_2 = sc.nextInt();

				switch (ask_2) {
				case 1:
					in = in + ask_2;
					System.out.println(ask_2 + "원을 입금하셨습니다.\n " + "현재 잔액은" + in + "입니다.");
				case 2:
					
				}

			

		}

	}
}
}
