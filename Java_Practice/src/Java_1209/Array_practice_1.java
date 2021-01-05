package Java_1209;

public class Array_practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[][] = new int[3][4];

		int i, k;

		int val = 1;
		 i =0;

		while (i < 3) {
			k = 0;
			while (k < 4) {
				aa[i][k] = val;
				val++;
				k++;

			} i++;

		}
	}

}
