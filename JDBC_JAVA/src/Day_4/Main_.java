package Day_4;

import java.util.Scanner;

public class Main_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
		
		while(b) {
			System.out.println("1. 날씨 ||2. 지역 || 3. 사용자 || 4. 우수회원");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				System.out.println("1. 온도 Input || 2. 온도 update || 3. 온도 조회");
				int select_tem = sc.nextInt();
				switch(select_tem) {
				
				case 1:
					//온도 Input
					break;
				case 2:
					//온도 update
					break;
				case 3:
					//온도 조회
					break;
				}
				break;
			case 2:
				System.out.println("1. 지역 Input || 2. 지역 update || 3. 지역 조회");
				int select_loc = sc.nextInt();
				switch(select_loc) {
				case 1:
					//지역 Input
					break;
				case 2:
					//지역 update
					break;
				case 3:
					//지역 조회
					break;
				}
				break;
			case 3:
				System.out.println("1. 사용자 Input || 2. 사용자 update || 3. 사용자 조회");
				int select_user = sc.nextInt();
				switch(select_user) {
				case 1:
					//사용자 Input
					break;
				case 2:
					//사용자 update
					break;
				case 3:
					//사용자 조회
					break;
				}
				break;
			case 4:
				System.out.println("우수회원 조회");
				break;
			}
			
		}

	}
}
