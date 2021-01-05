package Java_1204;

public class Sub_practicemm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "AB345";
		String num_str1 = "12BCD";
		String num_char = "ABC";

		System.out.println(num_str.substring(2));

		String num10 = num_str.substring(2);
		int num11 = Integer.parseInt(num10);

		System.out.println(num_str1.substring(0, 2));

		String num12 = num_str1.substring(0, 2);
		int num13 = Integer.parseInt(num12);

		System.out.println(num_char.substring(2, 3));

		String num14 = num_char.substring(2, 3);
		int num15 = Integer.parseInt(num14);
		
		
		System.out.println(num11+ num13 + num15);
		
	

	} 

}
