package Java_1204;

public class String_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num_str = "12345";

		System.out.println("String형: " + num_str);

		int str_num = Integer.parseInt(num_str);

		// int str_num2 = Integer.valueOf(num_str);

		System.out.println("Int형: " + str_num);
		// System.out.println("Int형: " + str_num2);

		String sum = num_str + 10;
		int sum_1 = str_num + 10;

		System.out.println(sum);
		System.out.println(sum_1);

	}

}
