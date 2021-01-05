package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_99 {

	public static void main(String[] args) {
		try{
		File file = new File("C:\\Users\\yj-605-14\\Downloads\\number.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split(" ");
			for(int i=0; i<array.length;i++) {
				//System.out.println(array[i]);
				System.out.println(array[i]+"x"+array[i+1]+"=" +array[i+2]);
				i += 2;
				
		
			}
		}


	} catch(FileNotFoundException e) {
		System.out.println(e);
	}

}
}