package Java_1203;

import java.util.Scanner;

public class String_practice5 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("무기선택");
			System.out.println("1.Sword, 2.Axe, 3.Hammer");

			String weapon = "";
			int ATTACK = 0;

			int weapon_num = sc.nextInt();

			int monster_hp = 100;

			System.out.println("독을 바르시겠습니까?");
			System.out.println("1.Yes, 2.No");
			int poison = sc.nextInt();

			if(poison == 1) {
				System.out.println("공격력이 2 증가합니다.");
			}

			if(weapon_num == 1) {
				weapon = "Sword";
				ATTACK = 12;

			}
			if(weapon_num == 2) {
				weapon = "Axe";
				ATTACK = 20;
			}

			if(weapon_num == 3) {
				weapon = "Hammer";
				ATTACK = 30;
			}

			System.out.println("공격하시겠습니까?");
			System.out.println("1.Yes, 2.No");
			int o = sc.nextInt();


			if(o == 1 && weapon.equals("Sword")) {

				if(poison ==1) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK -2));
				} 
				if(poison == 2) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK));
				}
				System.out.println("다시 공격하시겠습니까?");
				System.out.println("1.Yes, 2.No");
				int choice = sc.nextInt();
				int monster_hp2 = monster_hp -ATTACK;

				if(choice == 1) {
					double dice_1 = Math.random();
					int sum = 6;


					int dice_num =(int)(dice_1*sum)+1;

					if(dice_num == 1|| dice_num ==2 || dice_num ==3) {
						System.out.println("공격 성공");
						System.out.println("남은 monster HP"+(monster_hp2 -ATTACK));
					} 
					else if(dice_num == 4|| dice_num ==5 || dice_num ==6) {
						System.out.println("공격 실패");
					}
				}
				if(choice == 2) {
					System.out.println("공격안함");
				}

			}
			if(o == 1 && weapon.equals("Axe")) {
				if(poison ==1) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK -2));
				} 
				if(poison == 2) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK));
				}
			}
			if(o == 1 && weapon.equals("Hammer")) {
				if(poison ==1) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK -2));
				} 
				if(poison == 2) {
					System.out.println("남은 monster HP" +(monster_hp -ATTACK));
				}
		
			}
			if(o ==2) {
				System.out.println("공격을 하지 않습니다.");
		}
	}
}
}
