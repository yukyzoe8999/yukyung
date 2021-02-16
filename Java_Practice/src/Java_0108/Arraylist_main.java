package Java_0108;

import java.util.ArrayList;

public class Arraylist_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Field_val> fv = new ArrayList<Field_val>();

		fv.add(new Field_val("aa123@naver.com", "가나다라", "123456"));
		fv.add(new Field_val("qq345@naver.com", "마바사", "123456"));
		fv.add(new Field_val("ee567@naver.com", "ABCDE", "123456"));

		for(Field_val k: fv) {
			System.out.println(k);
		}
		System.out.println(fv.get(0).id);
		System.out.println(fv.get(0).pass);
		System.out.println(fv.get(0).email);
		
		System.out.println(fv.get(1).id);
		System.out.println(fv.get(1).pass);
		System.out.println(fv.get(1).email);		
		System.out.println(fv.get(2).id);
		System.out.println(fv.get(2).pass);
		System.out.println(fv.get(2).email);
	}

}
