package Java_1204;

public class Index_uni2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "AB123";
		String str_2 = "AB34B";
		int idx = 0;

		for (int i = 0; i < str_1.length(); i++) {

			char c = str_1.charAt(i);
			System.out.println("ChaAT: "+c);
			int num = c;

			if (num > 47 && num < 58) {
				idx = i;
				System.out.println(idx);
				break;
				
				
			}
		} 
		String sub = str_1.substring(idx, str_1.length());
		System.out.println(sub);
	}
}
