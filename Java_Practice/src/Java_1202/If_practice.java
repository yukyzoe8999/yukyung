package Java_1202;
import java.util.Scanner; 

public class If_practice {

	public static void main(String[] args) {
		try(// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			System.out.println();
			int  i = 48;

			if(i>100) {
				System.out.println("너무 많아요");
			}
			if(i<=100 || i>=50) {
				System.out.println("적당해요");
			} 
			else if (i<50) {
				System.out.println("너무 작아요");
			}
		}
	}
}


