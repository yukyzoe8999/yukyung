package Java_1214;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i = 10;
		int j = 20;
		int k = 30;
		int m = 40;
		
		int sum = 0;
		
		
		sum = first(i);
		System.out.println(sum);
		sum = second(j);
		System.out.println(sum);
		sum = third(k);
		System.out.println(sum);
		sum = fourth(m);
		System.out.println(sum);
		

	}

	public static int first(int i) {
		// TODO Auto-generated method stub
		int a =  i/2;
		return a;
		
	}
	private static int second(int j) {
		// TODO Auto-generated method stub
		int b = j/2;
		return b;
	}
	private static int third(int k) {
		// TODO Auto-generated method stub
		int c = k/2;
		return c;
	}
	private static int fourth(int m) {
		// TODO Auto-generated method stub
		int d = m/2;
		return d;
	}
}
