package Java_0104_2;

import java.util.Scanner;

public class AAA {

	public static void main(String[] args) {
		CCC list = new CCC();
		list.ArrayC = new BBB[4];
		list.current = 0;
		

		boolean b = true;
		while (b) {
			System.out.println("연산할 네개의 숫자를 입력해 주세요.");
			input(list);
			System.out.println("연산자를 입력해 주세요.\n "+ "1.+ 2.- 3.* 4./");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			switch(a) {
			case 1:
				plus(list);
				break;
			case 2:
				min(list);
				break;
			case 3:
				mul(list);
				break;
			case 4:
				div(list);
				break;
			}
			
			//print(list);
		}

	}

//	public static void print(CCC list) {
//		for (int i = 0; i < list.current; i++) {
//			BBB PtintB = list.ArrayC[i];
//
//			int num1 = PtintB.num1;
//			int num2 = PtintB.num2;
//			int num3 = PtintB.num3;
//			int num4 = PtintB.num4;
//
//			int sum = num1 + num2 + num3;
//
//			System.out.println("첫번째 숫자: " + num1);
//			System.out.println("두번째 숫자: " + num2);
//			System.out.println("세번째 숫자: " + num3);
//			System.out.println("합은: " + sum);
//
//		}
//	}

	public static void input(CCC list) {
		int num1;
		int num2;
		int num3;
		int num4;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자 입력");
		num1 = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		num2 = sc.nextInt();
		System.out.println("세번째 숫자 입력");
		num3 = sc.nextInt();
		System.out.println("네번째 숫자 입력");
		num4 = sc.nextInt();

		BBB newB = new BBB();

		newB.num1 = num1;
		newB.num2 = num2;
		newB.num3 = num3;
		newB.num4 = num4;

		if (list.ArrayC.length == list.current) {
			BBB[] temp = new BBB[list.ArrayC.length + 5];
			for (int i = 0; i < list.ArrayC.length; i++) {
				temp[i] = list.ArrayC[i];

			}
			list.ArrayC = temp;
		}

		list.ArrayC[list.current] = newB;
		list.current++;

	}

	
	public static void plus(CCC list) {
		for (int i = 0; i < list.current; i++) {
			BBB Ptintplus = list.ArrayC[i];

			int num1 = Ptintplus.num1;
			int num2 = Ptintplus.num2;
			int num3 = Ptintplus.num3;
			int num4 = Ptintplus.num4;

			int sum = num1 + num2 + num3 + num4;

			System.out.println("첫번째 숫자: " + num1);
			System.out.println("두번째 숫자: " + num2);
			System.out.println("세번째 숫자: " + num3);
			System.out.println("네번째 숫자: " + num4);

			System.out.println("덧셈 값: " + sum);
		
	}

}
	public static void min(CCC list) {
		for (int i = 0; i < list.current; i++) {
			BBB Ptintmin = list.ArrayC[i];

			int num1 = Ptintmin.num1;
			int num2 = Ptintmin.num2;
			int num3 = Ptintmin.num3;
			int num4 = Ptintmin.num4;

			int sum = num1 - num2 - num3 - num4;

			System.out.println("첫번째 숫자: " + num1);
			System.out.println("두번째 숫자: " + num2);
			System.out.println("세번째 숫자: " + num3);
			System.out.println("네번째 숫자: " + num4);

			System.out.println("뺄셈 값: " + sum);
		
	}

}
	public static void mul(CCC list) {
		for (int i = 0; i < list.current; i++) {
			BBB Ptintmul = list.ArrayC[i];

			int num1 = Ptintmul.num1;
			int num2 = Ptintmul.num2;
			int num3 = Ptintmul.num3;
			int num4 = Ptintmul.num4;

			int sum = num1 * num2 * num3 * num4;

			System.out.println("첫번째 숫자: " + num1);
			System.out.println("두번째 숫자: " + num2);
			System.out.println("세번째 숫자: " + num3);
			System.out.println("네번째 숫자: " + num4);

			System.out.println("곱셈 값: " + sum);
		
	}

}
	public static void div(CCC list) {
		for (int i = 0; i < list.current; i++) {
			BBB Ptintmdiv = list.ArrayC[i];

			int num1 = Ptintmdiv.num1;
			int num2 = Ptintmdiv.num2;
			int num3 = Ptintmdiv.num3;
			int num4 = Ptintmdiv.num4;

			double sum = num1 / num2 / num3 / num4;
			int b = (int)sum;
			

			System.out.println("첫번째 숫자: " + num1);
			System.out.println("두번째 숫자: " + num2);
			System.out.println("세번째 숫자: " + num3);
			System.out.println("네번째 숫자: " + num4);

			System.out.println("나눗셈 값: " + b);
		
	}

}
}
