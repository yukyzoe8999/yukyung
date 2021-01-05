package Java_0105;

import java.util.Scanner;

public class Book_contacts {
	Book contacts[];
	int count;

	public Book_contacts() {
		this.contacts = new Book[5];
		this.count = 0;
	}

	public static void call(Book_contacts list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화 걸 상대방의 이름을 입력해주세요.");
		String k = sc.nextLine();
		for (int i = 0; i < list.count; i++) {
			Book str = list.contacts[i];
			String name = str.name;

			if (name.contains(k)) {
				System.out.println(name + "에게 전화를 거는중입니다.");
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

	public static void print(Book_contacts list) {

		for (int i = 0; i < list.count; i++) {
			Book str = list.contacts[i];
			//String name = str.name;
			//String number = str.number;
			//String mail = str.mail;
			
			str.getName();
			str.getNumber();
			str.getMail();

			System.out.println("이름: " + str.getName());
			System.out.println("번호: " + str.getNumber());
			System.out.println("이메일: " + str.getMail());
			System.out.println(" ");

		}
	}

	public static void input(Book_contacts list) {
		Scanner sc = new Scanner(System.in);
		String name;
		String number;
		String mail;

		System.out.println("이름을 입력해주세요.");
		name = sc.nextLine();
		System.out.println("-없이" + "전화번호 11자리를 입력해주세요.");
		number = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		mail = sc.nextLine();

		Book num_book = new Book();

		//num_book.name = name;
		//num_book.number = number;
		//num_book.mail = mail;
		
		num_book.setName(name);
		num_book.setNumber(number);
		num_book.setMail(mail);

		list.contacts[list.count] = num_book;
		list.count++;

	}

}
