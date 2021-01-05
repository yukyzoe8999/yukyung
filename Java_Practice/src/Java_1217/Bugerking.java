package Java_1217;

public class Bugerking {
	static int buger1 = 5000;
	static int buger2 = 4000;
	
	
	public static int buger1(int money) {
		money = money - buger1; 
		System.out.println("buger1을 선택하셨습니다. 가격은 5000원입니다.");
		return money;
		
		
	}
	public static int buger2(int money) {
		money = money - buger2;
		System.out.println("buger2을 선택하셨습니다. 가격은 4000원 입니다.");

		return money;
	}


} 
