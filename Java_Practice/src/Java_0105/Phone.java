package Java_0105;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 전화번호부 저장 2. 전화번호부 보기
		Scanner sc = new Scanner(System.in);
		Book_contacts list = new Book_contacts();
		// list.contacts = new Book[5];

		boolean b = true;

		while (b) {
			System.out.println("1. 전화번호부 저장 2. 전화번호부 보기 3. 전화 걸기 4. 나가기");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				// input(list);
				list.input(list);
				break;
			case 2:
				// print(list);
				list.print(list);
				break;
			case 3:
				list.call(list);
				break;
			case 4:
				System.out.println("종료합니다.");
				b = false;
			}

		}

	}
}
//	public static void print(Book_contacts list) {
//
//		for (int i = 0; i < list.count; i++) {
//			Book str = list.contacts[i];
//			String name = str.name;
//			String number = str.number;
//			String mail = str.mail;
//
//			System.out.println("이름: " + name);
//			System.out.println("번호: " + number);
//			System.out.println("이메일: " + mail);
//
//		}
//	}
//
//	public static void input(Book_contacts list) {
//		Scanner sc = new Scanner(System.in);
//		String name;
//		String number;
//		String mail;
//		int count = 0;
//		System.out.println("이름을 입력해주세요.");
//		name = sc.nextLine();
//		System.out.println("번화번호를 입력해주세요.");
//		number = sc.nextLine();
//		System.out.println("이메일을 입력해주세요.");
//		mail = sc.nextLine();
//
//		Book num_book = new Book();
//
//		num_book.name = name;
//		num_book.number = number;
//		num_book.mail = mail;
//
//		list.contacts[list.count] = num_book;
//		list.count++;
//
//	}
//
//}
