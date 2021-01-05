package Java_1214;

import java.util.Scanner;

public class remote_control_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean turnon = true;
		boolean on = true;
		int ch = 0;
		int sound = 0;
		

		while (turnon) {
			System.out.println("전원을 켜시겠습니까?\n " + "1.네 2. 아니오");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("전원을 켭니다.");
			}
			on = true;
			
			while (on) {
				
				switch (a) {
				case 1:
					System.out.println("현재채널: " + ch + "현재음량: " + sound);
					System.out.println("1.채널을 바꾼다 2. 음량을 조절한다. 3. 채널 선택 4. 전원 끔. ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						ch = Channel_select(ch);
						System.out.println("현재 채널: " + ch);
						break;
					case 2:
						sound = Soun(sound);
						System.out.println("현재 음량: " + sound);
						break;
					case 3:
						ch = changech(ch);
						System.out.println("현재 체널: " + ch);
						break;

					case 4:
						on = false;

					}
				}
			}
			if (a == 2) {
				System.out.println("전원을 켜지 않습니다.");
			}

		}
	}

	public static int Channel_select(int ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1.채널을 올린다. 2. 채널을 내린다.");
		int choice_2 = sc.nextInt();
		switch (choice_2) {
		case 1:
			ch += 1;
			if (ch >= 100) {
				System.out.println("더이상 채널을 올릴 수 없습니다.");				

			}
			break;
		case 2:
			ch -= 1;
			if (ch <= 0) {
				System.out.println("더이상 채널을 내릴 수 없습니다.");

			}
			break;
		}
		return ch;
	}

	public static int Soun(int sound) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 음량을 올린다 2. 음량을 내린다. ");
		int choice_3 = sc.nextInt();
		switch (choice_3) {
		case 1:
			sound += 1;
			if (sound >= 40) {
				System.out.println("더이상 음량을 올릴 수 없습니다.");

			}
			break;
		case 2:
			sound -= 1;
			if (sound <= 0) {
				System.out.println("더이상 음량을 내릴 수 없습니다.");

			}
			break;

		}
		return sound;

	}
	public static int changech(int new_ch) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("채널 번호를 입력하세요.");
		new_ch = sc.nextInt();
		return new_ch;
	}
}
