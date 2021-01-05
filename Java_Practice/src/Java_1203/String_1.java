package Java_1203;

public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ABCD";
		String b = "ABCD";
		String c = new String ("ABCD");
		
		System.out.println(a);
		System.out.println(b);
		
		if(a==c ) {
			System.out.println("같다.");
		}
		else if(a.equals(b)) {
			System.out.println("둘은 같다.");
			
		} else {
			System.out.println("같지 않다.");
		}

	}

}
