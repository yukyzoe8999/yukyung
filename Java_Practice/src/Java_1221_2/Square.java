package Java_1221_2;

public class Square {
	public static void printSquare(int x) {
		System.out.println(x * x); // 메인 클래스 생성
	}

	public static void main(String[] args) {
		int value = 2;
		System.out.println(value); //위에서 선언한 인트값 2 출력
		printSquare(value);   //메인에서 선언한 2 값을 printSquare에 대입해서 2*2를 연산함
		printSquare(3); //printSquare에 3을 넣어서 3*3을 연산함
		printSquare(value * 2); // 4*4fh 연산함
	}
}
