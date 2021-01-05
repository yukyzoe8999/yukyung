package Java_1204;

public class For_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "1234";
		char c = 'E';

		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			// System.out.println(str.substring(i, i + 1));
			String str_1 = str.substring(i, i + 1);
			int sub = Integer.parseInt(str_1);

			int multi = sub * c;
			//System.out.println(multi);

			sum += multi;
		}
		System.out.println("총합은: " +sum);
	}
}