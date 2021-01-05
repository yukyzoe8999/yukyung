package Java_1204;

public class Sub_string_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDE";

		char c = str.charAt(3);
		System.out.println("CharAt: " + c);

		for (int i = 0; i <str.length(); i++) {
			System.out.println(str.substring(i, i+1));
		
		}

	}

}
