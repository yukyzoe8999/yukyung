package Java_1202;
import java.util.Scanner;
public class If_practice2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
		
			int i = 3;
			int j = 4;
			int u = 5;
			
			int k = i*j;
			int h = k%u;
			
			if(k%2!=0) {
				System.out.println("곱셈 값");
			}
		    if(k%2==0) {
			 System.out.println(h);
		    }
		   
		 }
		}

	}