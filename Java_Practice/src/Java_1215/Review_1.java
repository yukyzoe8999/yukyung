package Java_1215;

public class Review_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		
		one(i);

	}

	public static void one(int i) {
		// TODO Auto-generated method stub
		i = i+10;
		int sum = two(i);
		//four(i);
		System.out.println(sum);
	}

	private static int two(int i) {
		// TODO Auto-generated method stub
		i = i+10;
		
		return i;
	}
	private static void four(int i) {
		// TODO Auto-generated method stub
		int sum = i+10;
		System.out.println(sum);
	}

}
