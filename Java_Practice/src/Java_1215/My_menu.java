package Java_1215;

import java.util.Scanner;

public class My_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menu [] = {"라면","오뎅","떡볶이","순대"};
		boolean select = true;
		int sum = 0;
		while(select) {
			Scanner sc = new Scanner(System.in);
			System.out.println("음식을 골라주세요.\n " + "1.라면, 2.오뎅, 3.떡볶이, 4.순대");
			int a = sc.nextInt();
				
			int food = menu_select(a);
			sum+=food;
			System.out.println("합계: "+sum);
			System.out.println("계산하시겠습니까?" +"1. 예 2. 아니오.");
			int b = sc.nextInt();
			if(b==1) {
				select = false;
				System.out.println("합계: "+sum);
			} else if(b==2) {
				select = true;
				System.out.println("계속 음식을 고릅니다.");

			}
			
		}

	}

	public static int menu_select(int a) {
		// TODO Auto-generated method stub
		String name = "";
		int price = 0;
		switch(a) {
		case 1:
			name = "라면";
			price = 1000;
			break;
		case 2:
			name = "오뎅";
			price = 2000;
			break;
		case 3:
			name = "떡볶이";
			price = 3000;
			break;
		case 4:
			name = "순대";
			price = 4000;
			break;			
		}
		return price;
	}


}
