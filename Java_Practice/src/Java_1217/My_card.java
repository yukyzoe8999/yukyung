package Java_1217;

public class My_card {
	static String card = "내 카드";
	static int money = 0;

	public static void main(String[] args) {

		Bank bank = new Bank();

		int a = bank.bank(card);
		System.out.println(a+"번을 선택하셨습니다.");
		
		if(a==1) {
			money = bank.balance(money);
			System.out.println(money);
		}
			

	}

}
