package Java_0106;

import java.util.Scanner;

import Java_0105.Book;

public class Rentcar_system {

	Car_set appl = new Car_set();

	public void print() {
		for (int i = 0; i < appl.num(i); i++) {
			Information c = appl.infom(i);

			c.getCar();
			c.getName();
			c.getPnumber();

			System.out.println("선택하신 차량:" + c.getCar());
			System.out.println("성함:" + c.getName());
			System.out.println("전화번호:" + c.getPnumber());
			System.out.println(" ");
		}
	}

	public void input() {
		String name;
		String car;
		String Pnumber;
		Scanner sc = new Scanner(System.in);
		// Information t = new Information();
		System.out.println("렌트하실 차를 입력해주세요.\n " + "소나타 or 그랜저 or 벤츠");
		car = sc.nextLine();

		System.out.println("대여하시는 분의 이름을 입력해주세요.");
		name = sc.nextLine();

		System.out.println("대여하시는 분의 전화번호를 입력해주세요.");
		Pnumber = sc.nextLine();

		appl.setset(name, car, Pnumber);

	}

}
