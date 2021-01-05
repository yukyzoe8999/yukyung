package Java_1208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Array_5_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\workspace\\trte.txt");
		File file_1 = new File("C:\\workspace\\trtr.txt");

		try (FileWriter filewriter = new FileWriter(file)) {
			Scanner sc = new Scanner(file_1);
			String str = "";
			String array[] = null;
			//System.out.println("1111111111");
			while (sc.hasNextLine()) {
				str = sc.nextLine();
				System.out.println(str);
				array = str.split("-|;|@");				

			}
			
			PrintWriter pw = new PrintWriter(filewriter);
			for (int i = 0; i < array.length; i++) {
				pw.print(array[i]+"||");
				//pw.println(array[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}
