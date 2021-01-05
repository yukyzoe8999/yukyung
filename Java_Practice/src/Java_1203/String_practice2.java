package Java_1203;

import java.util.Scanner;

public class String_practice2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println("무기선택");
			System.out.println("1.Sword, 2.Axe, 3.Hammer");
			
			String weapon = "";
			int ATTACK = 0;
			
			int weapon_num = sc.nextInt();
		
			int monster_hp = 100;

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
			if(weapon.equals("Sword")) {
				System.out.println( monster_hp -ATTACK);
			}
			if(weapon.equals("Axe")) {
				System.out.println( monster_hp -ATTACK);
			}
			if(weapon.equals("Hammer")) {
				System.out.println( monster_hp -ATTACK);
			}
		}

	}
}
