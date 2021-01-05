package Java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Split_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\yj-605-14\\Downloads\\number_1.txt");
			Scanner sc = new Scanner(file);
			//while (sc.hasNextLine()) {
				String str = sc.nextLine();
				String array[] = str.split("\\+");
				//System.out.println(array.length);				
				//System.out.println(array[0]+array[1]);
				
				//for (int i = 0; i < array.length; i++) {
					//System.out.println(array[i]);										
				//}
				int a = Integer.parseInt(array[0]);
				int b = Integer.parseInt(array[1]);
				System.out.println(a+"+"+b+"="+(a+b));
				//for (int i = 0; i < str.length(); i++) {
					//String a = str.substring(0,2);
					//String b = str.substring(3,6);
					//System.out.println(a+"+"+b+"="+a+b);
				//}
			//}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}
