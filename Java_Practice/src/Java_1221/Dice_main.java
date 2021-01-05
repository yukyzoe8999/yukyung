package Java_1221;

public class Dice_main {

	public static void main(String[] args) {

		Dice dice = new Dice();
		int dice_1 = dice.dice_play(5);

		switch (dice_1) {
		case 1:
			dice.one();
			break;
		case 2:
			dice.two();
			break;
		case 3:
			dice.three();
			break;
		case 4:
			dice.four();
			break;
		case 5:
			dice.five();
			break;
		}

	}

}
