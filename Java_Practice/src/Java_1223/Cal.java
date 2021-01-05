package Java_1223;

import java.util.Scanner;

public class Cal {
	private String s;
	

	public String getS() {
		Cal_scanner();
		return s;
	}

	public void setS(String str) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("연산할 숫자를 입력해주세요.");
	    str = sc1.nextLine();
		this.s = str;
	}

	public void Cal_scanner() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("연산할 숫자를 입력해주세요.");
		String str = sc1.nextLine();
	}

	public void cal_check(String s) {
		int leng = s.length();
		String strArray[] = new String[leng];
		if (leng > 1) {
			for (int i = 0; i < leng; i++) {
				strArray[i] = s.substring(i, i + 1);
			}
			if (val_ch(strArray) == true) {
				// 더하기 //빼기 숫자로 사용
			} else { // 기호로 사용
			}
		} else {
			strArray[0] = s;
			val_ch(strArray);
		}
	}

	public boolean val_ch(String strArray[]) {
		String number[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		boolean check = false;
		for (int j = 0; j < strArray.length; j++) {
			for (int i = 0; i < number.length; i++) {
				if (strArray[j].equals(number[i])) {
					check = true;
					break;
				} else {
					check = false;
				}
			}
		}
		return check;
	}

}
