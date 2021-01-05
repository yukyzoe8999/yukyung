package Java_1211;

import java.util.Scanner;

public class remote_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean turnon = true;
		boolean on = true;
		boolean on_2 = true;
		boolean on_3 = true;
		boolean on_4 = true;

		int ch = 0;
		int sound = 0;

		while (turnon) {
			System.out.println("전원을 켜시겠습니까?\n " + "1.네 2. 아니오");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("전원을 켭니다.");
				System.out.println("현재채널: " + ch + "현재음량: " + sound);

				while (on) {
					on_2 = true;
					on_3 = true;
					on_4 = true;

					System.out.println("1.채널을 바꾼다 2. 음량을 조절한다. 3. 채널 번호 입력");
					int choice = sc.nextInt();
					if (choice == 1) {

						while (on_2) {

							System.out.println("1.채널을 올린다. 2. 채널을 내린다. 3. 나간다.");
							int choice_2 = sc.nextInt();
							switch (choice_2) {
							case 1:
								ch += 1;
								if (ch >= 100) {
									System.out.println("더이상 채널을 올릴 수 없습니다.");
									on_2 = false;
								}
								break;
							case 2:
								ch -= 1;
								if (ch <= 0) {
									System.out.println("더이상 채널을 내릴 수 없습니다.");
									on_2 = false;
								}
								break;
							case 3:
								on_2 = false;
								break;
							}
							System.out.println("현재 채널: " + ch);

						}
					} else if (choice == 2) {

						while (on_3) {

							System.out.println("1. 음량을 올린다 2. 음량을 내린다. 3. 나간다.");
							int choice_3 = sc.nextInt();
							switch (choice_3) {
							case 1:
								sound += 1;
								if (sound >= 40) {
									System.out.println("더이상 음량을 올릴 수 없습니다.");
									on_3 = false;
								}
								break;
							case 2:
								sound -= 1;
								if (sound <= 0) {
									System.out.println("더이상 음량을 내릴 수 없습니다.");
									on_3 = false;
								}
								break;
							case 3:
								on_3 = false;
								break;
							}
							System.out.println("현재 음량: " + sound);
						}
					} else if (choice == 3) {
						while (on_4) {
							System.out.println("채널 번호를 입력하세요.");
							int choice_4 = sc.nextInt();
							int newnum = choice_4;
							ch = newnum;
							System.out.println("현재 채널: " + ch);
							System.out.println("계속해서 바꾸시겠습니까?\n " + "1.네 2. 아니오.");
							int choice_5 = sc.nextInt();

							if (choice_5 == 1) {
								on_4 = true;
							} else if (choice_5 == 2) {
								on_4 = false;
							}

						}
					}
				}

			} else if (a == 2) {
				System.out.println("전원을 켜지 않습니다.");
			}

		}
	}
}
