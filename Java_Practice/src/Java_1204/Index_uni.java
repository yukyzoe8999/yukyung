package Java_1204;

public class Index_uni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "AB123";
		String str_2 = "AB34B";

		for (int i = 0; i < str_1.length(); i++) {

			char c = str_1.charAt(i);
			int num = c;

			if (num > 47 && num < 58) {
				System.out.println("숫자가 포함되어 있습니다.");
			}
			

		} for (int j = 0; j < str_2.length(); j++) {

			char d = str_2.charAt(j);
			int num_2 = d;

			if (num_2 > 47 && num_2 < 58) {
				System.out.println("숫자가 포함되어 있습니다.");
			}

	}
}
}