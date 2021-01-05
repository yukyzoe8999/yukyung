package Java_1204;

public class Sub_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "AB345";
		String num_str1 = "12BCD";
		String num_char = "ABC";

		for (int i = 0; i < 1; i++) {
			System.out.println(num_str.substring(2));

		}
		String num10 = num_str.substring(2);
		int num11 = Integer.parseInt(num10);
		
	
		
		for (int i = 0; i < 1; i++) {
			System.out.println(num_str1.substring(0, 2));

		}
		String num12 = num_str1.substring(0, 2);
		int num13 = Integer.parseInt(num12);

		char c_1 = ' ';

		for (int i = 0; i < num_char.length(); i++) {

			c_1 = num_char.charAt(i);
			System.out.println(i);

		}
		
		System.out.println(c_1);
		System.out.println(num11 + num13 +c_1);

	}

}