package Java_1214;

public class Test_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int hap = 0;

		hap = plus(i, j);
		System.out.println(hap);

	}

	public static int plus(int i, int j) {
		// TODO Auto-generated method stub
		int sum = i + j;
		sum = newr(sum);
		return sum;
	}

	private static int newr(int hap) {
		// TODO Auto-generated method stub
		hap = hap - 5;
		return hap;
	}

}
