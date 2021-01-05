package Java_1221;

import java.util.Random;

public class Dice {
	int dice1;

	public int dice_play(int dice) {
		Random rdm = new Random();

		this.dice1 = rdm.nextInt(dice);
		return dice1;
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
