package Java_0112;

import java.util.ArrayList;
import java.util.Scanner;

public class Subway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Subway_w aa = new Subway_w();
		Subway_in bb = new Subway_in();
		ArrayList<Subway_in> subway = new ArrayList<Subway_in>();

		boolean b = true;

		while (b) {
			System.out.println("1. 샌드위치 주문 2. 주문 확인");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				aa.input(bb);
			case 2:
				//aa.output(bb);
				aa.output(bb);
				
			}
		}
	}

	

}
