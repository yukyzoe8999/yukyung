package Java_1230_test;

import java.util.Scanner;

public class Coding_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		boolean on_2 = true;
		boolean on_3 = true;
		boolean on_4 = true;
		boolean on_5 = true;

		int chal = 1;
		int sound = 0;

		while (on) {
			System.out.println("TV전원을 켜시겠습니까?" + "1. 네 2. 아니오");
			int i = sc.nextInt();
			if (i == 1) {
				System.out.println("전원을 켰습니다.");

				while (on_2) {
					on_2 = true;
					on_4 = true;
					on_5 = true;
					System.out.println("1. 채널선택 2. 볼륨조절 3. TV끄기");
					int j = sc.nextInt();
						
					if(j==1) {
							while(on_4) {
								
							System.out.println("1.채널을 올린다 2. 채널을 내린다 3. 뒤로가기");
							int k = sc.nextInt();
							switch (k) {
							case 1:
								chal++;
								if(chal>100) {
									chal=100;
									System.out.println("더이상 채널을 올릴 수 없습니다.");
									break;
								}
								break;
							case 2:
								chal--;
								if(chal<1) {
									chal=1;
									System.out.println("더이상 채널을 내릴 수 없습니다.");
									break;
								}
								break;
							case 3:
								on_4 = false;
								break;

							}
							System.out.println("현재채널: " + chal);
						}
					}
						if(j==2) {
							while(on_5) {
							System.out.println("1.볼륨을 올린다 2. 볼륨을 내린다 3. 뒤로가기");
							int y = sc.nextInt();
							switch (y) {
							case 1:
								sound++;
								if(sound>100) {
									sound=100;
									System.out.println("더이상 볼륨을 올릴 수 없습니다.");
									break;
								}
								break;
							case 2:
								sound--;
								if(sound<0) {
									sound=0;
									System.out.println("더이상 볼륨을 내릴 수 없습니다.");
									break;
								}
								break;
							case 3:
								on_5 = false;
								break;
							} 
							System.out.println("현재볼륨: " + sound);
							}
						}
						if(j==3) {
							System.out.println("TV전원을 껐습니다.");
							on_3 = false;
							break;
						}
					}
					

			} else if (i == 2) {
				System.out.println("전원을 키지 않는다.");
			}
		}

	}
}
