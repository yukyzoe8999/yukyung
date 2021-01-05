package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) throws IOException {
		try{
		File file = new File("C:\\workspace\\trtr.txt");
		File file_1 = new File("C:\\workspace\\trtr.txt");

		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String array[] = str.split("-|@");
			FileWriter filewriter = new FileWriter(file);
			PrintWriter pw = new PrintWriter(filewriter);
			for(int i=0; i<array.length;i++) {
				pw.println(array[i]);
			}
			
		}
		
		


	} catch(FileNotFoundException e) {
		System.out.println(e);
	}

}
}