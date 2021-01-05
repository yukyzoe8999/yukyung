package Java_1221;

import java.util.Random;

//import java.util.Random;

public class Dice_2 {
	private int dice1;

	public int getDice1() {
		return dice1;
	}

	public int setDice1(int dice1) {
		Random rdm = new Random();
		return this.dice1 = rdm.nextInt(dice1);
		
	}
	public void one() {
		System.out.println(dice1);
	}

	public void two() {
		System.out.println(dice1);
	}

	public void three() {
		System.out.println(dice1);
	}

	public void four() {
		System.out.println(dice1);
	}

	public void five() {
		System.out.println(dice1);
	}


}
