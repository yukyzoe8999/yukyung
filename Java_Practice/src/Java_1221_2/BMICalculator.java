package Java_1221_2;

import java.util.Scanner;

class BMICalculator {
	public static double calculateBMI(double weight, double tall) {
		// 해당 메소드를 구현하세요.
		double d = weight / tall * tall;
		return d;
	}

	public static void printBMIClassification(double bmi) {
		// 해당 메소드를 구현하세요.
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("정상");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("과체중");
		} else if (bmi >= 30) {
			System.out.println("비만");
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요.");
		double weight = input.nextDouble();
		System.out.println("키를 입력하세요.");
		double tall = input.nextDouble();
		// BMI 지수 계산
		double bmi = calculateBMI(weight, tall);
		// BMI 지수를 입력하여 비만도 결과 출력
		printBMIClassification(bmi);
	}
}
