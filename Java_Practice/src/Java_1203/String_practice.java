package Java_1203;

import java.util.Scanner;

public class String_practice {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("무기선택");
			System.out.println("1.Sword, 2.Axe, 3.Hammer");
			
			String weapon = "";
			int weapon_num = sc.nextInt();
		
			int monster_hp = 100;

			if(weapon_num == 1) {
				weapon = "Sword";
			}
			if(weapon_num == 2) {
				weapon = "Axe";
			}
			
			if(weapon_num == 3) {
				weapon = "Hammer";
			}
			if(weapon.equals("Sword")) {
				System.out.println( monster_hp -12);
			}
			if(weapon.equals("Axe")) {
				System.out.println( monster_hp -20);
			}
		}

	}
}
