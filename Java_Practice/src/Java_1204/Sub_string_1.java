package Java_1204;

public class Sub_string_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		String str_2 = "abc";

		char c_1 = ' ';
		char c_2 = ' ';
		

		for (int i = 0; i < str.length(); i++) {

			c_1 = str.charAt(i);

		}
		for (int j = 0; j < str_2.length(); j++) {

			c_2 = str_2.charAt(j);

		}
		
		System.out.println(c_1);
		System.out.println(c_2);
		
		int sum = c_1+c_2;
		System.out.println(sum);
		
	
				
	

	}

}
