package Java_1202;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dice = Math.random();
			//	System.out.println(dice);
		int dice_num =(int)(dice*6)+1;
		
		if(dice_num >6 ) { 
			System.out.println("주사위 값은: " + (dice_num - 1));
		}
		else {
			System.out.println("주사위 값은: " + dice_num);
		}
	}

}
