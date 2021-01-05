package Java_1204;

public class Contains_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yang!";

		if (str.contains("Yang")) {
			System.out.println("대소문자 구분");
		}
		if (str.contains("yang")) {
			System.out.println("대소문자 구분 못함");
		}
		boolean con =str.contains("yang");
		System.out.println("Yang값이 있는가?" +con);

		int i = str.indexOf("!");
		System.out.println("인덱스 값 : " + i);

	}

}
