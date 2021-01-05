package Java_1209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Split_file_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("C:\\Users\\yj-605-14\\Downloads\\number_1.txt");
			Scanner sc = new Scanner(file);
			String str = sc.nextLine();
			String sub = "";
			int j = 0;
			int idx[] = new int[str.length()];
			
			//System.out.println(str);

			for (int i = 0; i < str.length(); i++) {
				sub = str.substring(i, i + 1);
				int sid  = sub.indexOf("+");
				if (sid!=-1) {
					idx[j] = i;
					j++;				
			
				} else if(sid!=1) {
					System.out.println(idx[i]);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
}
