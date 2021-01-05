package Java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Split_file_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\yj-605-14\\Downloads\\number_1.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
			
			String str = sc.nextLine();
			int io =str.indexOf("+");
			//System.out.println(io);
			//System.out.println(str.length());
			
			String plus = str.substring(io,io+1);
			System.out.println(plus);
			
			String sub_1 = str.substring(0,io);
			String sub_2 = str.substring(io+1,str.length());
			System.out.println(sub_1);
			System.out.println(sub_2);
			int a = Integer.parseInt(sub_1);
			int b = Integer.parseInt(sub_2);
			System.out.println(a+"+"+b+"="+(a+b));
			
			
				
		} 
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}
