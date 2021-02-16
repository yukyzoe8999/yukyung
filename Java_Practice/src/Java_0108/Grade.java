package Java_0108;

import java.util.ArrayList;
import java.util.Scanner;

import Java_0106.Exam;


public class Grade {
	static ArrayList<Exam> ex = new ArrayList<Exam>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			System.out.println("----------------------------------------------------------");
			System.out.println("|         메인 메뉴                   | ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\t1. 성적입력 ");
			System.out.println("\t2. 성적출력 ");
			System.out.println("\t3. 성적삭제 ");
			System.out.println("\t선택> ");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				input(); //
				break;
			case 2:
				print();

				break;
			case 3:
				remove();
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다 1~3 까지의 숫자를 입력해주세요.");
			}
		}

	}
	public static void remove() {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇번째 학생의 성적을 삭제하시겠습니까?");
		int a = scan.nextInt();
		for( int i=0; i<ex.size();i++) {
			if(ex.indexOf(i)==a) {
				ex.remove(i-1);
				System.out.println(ex);
			}
		}
	}

	public static void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

//		for (int i = 0; i < ex.size(); i++) {
//			Exam exam = ex.get(i);
//			int kor = exam.getKor();
//			int eng = exam.getEng();
//			int math = exam.getMath();
//
//			int total = kor + eng + math;
//			double avg = total / 3.0;
		
			for(int j=0;j<ex.size();j++) {
				System.out.println(j+1+"번째 학생");
				System.out.println("국어 성적: "+ex.get(j).getKor());
				System.out.println("영어 성적: "+ex.get(j).getEng());
				System.out.println("수학 성적: "+ex.get(j).getMath());
				
				
			}
			
			

		}
	

	public static void input() {
		int kor;
		int eng;
		int math;
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			if (kor < 0 || 100 < kor)
				System.out.println("국어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (kor < 0 || 100 < kor);

		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			if (eng < 0 || 100 < eng)
				System.out.println("영어 성적은 0~100까지의 범위만 입력해주세요.");
		} while (eng < 0 || 100 < eng);
		System.out.println("----------------------------------------------------------");

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			if (math < 0 || 100 < math)
				System.out.println("수학 성적은 0~100까지의 범위만 입력해주세요.");
		} while (math < 0 || 100 < math);
		System.out.println("----------------------------------------------------------");

		ex.add(new Exam(kor, eng, math));

	}

}
