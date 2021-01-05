package Java_1203;

import java.util.Scanner;

public class Switch_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			int year;
			System.out.println("출생년도를 입력하세요: ");
			year = sc.nextInt();
			
			year = year%12;
			
			if(year == 0) {
				System.out.println("원숭이띠");
			}
			if(year == 1) {
				System.out.println("닭띠");
			}
			if(year == 2) {
				System.out.println("개띠");
			}
			if(year == 3) {
				System.out.println("돼지띠");
			}
			if(year == 4) {
				System.out.println("쥐띠");
			}
			
			if(year == 5) {
				System.out.println("소띠");
			}
			if(year == 6) {
				System.out.println("호랑이띠");
			}
			if(year == 7) {
				System.out.println("토끼띠");
			}
			if(year == 8) {
				System.out.println("용띠");
			}
			if(year == 9) {
				System.out.println("뱀띠");
			}
			if(year == 10) {
				System.out.println("말띠");
			}
			if(year == 11) {
				System.out.println("양띠");
			}
     

				
			}
		}

	}