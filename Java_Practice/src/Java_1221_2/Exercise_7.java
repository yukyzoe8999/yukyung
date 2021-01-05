package Java_1221_2;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("유로입력."); 
		int a = sc.nextInt(); //58
		System.out.println("달러입력."); 
		int b = sc.nextInt(); //32
		
		double euro =1320.48026;
		double dollar = 1063.82979;
		
		int won = (int)(euro*a);
	    int won_2 = (int)(dollar*b);
	    
	    System.out.println(a+"유로"+b+"달러"+"="+won+won_2+"원");
	}

}
