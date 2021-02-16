package Java_0112;

import java.util.ArrayList;
import java.util.Scanner;

public class Subway_w {
	Subway_in ing = new Subway_in();
	String str [] = new String[50];
	int count = 0;
	ArrayList<String> sub = new ArrayList<String>();

	public void output(Subway_in ing) {
		for(int i = 0; i<count;i++) {
			str[count] =sub.get(i);
			count++;
			System.out.println(str);
		}
	
	}
	public void input(Subway_in ing) {
		String bread[] = { "플랫", "오트", "파마산" };
		String onion = "양파";
		String pickle = "피클";
		String ham = "햄";
		String sauce[] = { "케첩", "마요" };
		

		Scanner sc = new Scanner(System.in);
		System.out.println("샌드위치 빵을 선택해 주세요");
		System.out.println("1. 플랫 2. 오트 3. 파마산");
		int brd = sc.nextInt();
	
		if (brd == 1) {
			sub.add(0, bread[0]);
		} else if (brd == 2) {
			sub.add(0, bread[1]);
		} else if (brd == 3) {
			sub.add(0, bread[2]);
		}
		
		System.out.println("양파를 넣으시겠습니까? \n" + "1.네 2. 아니오");
		int a = sc.nextInt();
		if (a == 1) {
			sub.add(onion);
		} else {
			sub.add("NO 양파");
			//System.out.println("NO 양파");
		}

		System.out.println("피클를 넣으시겠습니까? \n" + "1.네 2. 아니오");
		int b = sc.nextInt();
		if (b == 1) {
			sub.add(pickle);
		} else {
			sub.add("NO 피클");
			//System.out.println("NO 피클");

		}
	
		System.out.println("햄를 넣으시겠습니까? \n" + "1.네 2. 아니오");
		int c = sc.nextInt();
		if (c == 1) {
			sub.add(ham);
		} else {
			sub.add("NO 햄");
			//System.out.println("NO 햄");

		}

		System.out.println("소스를 선택해주세요. \n" + "1. 케첩 2. 마요");
		int sac = sc.nextInt();
		if (sac == 1) {
			sub.add(sauce[0]);
		} else if (sac == 2) {
			sub.add(sauce[1]);
		}
		//ing.setSubway(sub);
		//subway.add(sub);
		
		System.out.println(sub);
		System.out.println("주문이 완료되었습니다.");
	}
}
