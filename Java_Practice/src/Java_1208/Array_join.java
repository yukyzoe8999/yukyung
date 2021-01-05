package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Array_join {

	public static void main(String[] args) {
		try{
		File file = new File("C:\\workspace\\trtr.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split("-|;|@");
			for(int i=0; i<array.length;i++) {
				System.out.println(array[i]);
			}
		}


	} catch(FileNotFoundException e) {
		System.out.println(e);
	}

}
}