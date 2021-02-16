package Java_0108;

import java.util.ArrayList;

public class A_list {

	public static void main(String[] args) {

		ArrayList<String> str_array = new ArrayList<String>();
		String str = "ABC";
		int cnt = str.length();
		for (int i = 0; i < cnt; i++) {
			str_array.add(str.substring(i, i + 1));
		}
		System.out.println(str_array);
		System.out.println(str_array.get(1));
		System.out.println("배열길이: "+str_array.size());
		System.out.println(str_array.contains("A"));
		
		//str_array.remove("C");
		//str_array.add(2, "b");
		//str_array.remove(2);
		//str_array.remove(1);
		System.out.println(str_array);
		
		for(int i=0;i<str_array.size();i++) {
			System.out.println("출력: "+str_array.get(i));
		}
	    for(String k: str_array) {
	    	System.out.println("출력2: "+k);
	    }
	}
}
