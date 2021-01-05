package Java_1208;

public class Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 1;
		for (int i = 1; i <= 10; i++) {

			if (i == 10) {
				i = 1;
				j++;
				if (j == 10) {
					break;
				}
			}

			System.out.println(j + "*" + i + "=" + j * i);

		}

	}

}
