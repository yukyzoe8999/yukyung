package Java_1230_test;

import java.util.Scanner;

public class Smartphone_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone phone = new Smartphone();

		//phone.setList(list);
			
		while(true) {
			
		}
		
	}
	public void set(Smartphone phone) {
		String list[]={ "김씨", "박씨", "이씨" };
		String call = "call";
		String time = "time";
		String internet = "internet";
		
		//phone.setCall(scan(call));
		phone.setTime(time);
		phone.setInternet(internet);
	}
	public static int scan(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.전화번호부 2. 전화걸기 3. 시간확인 4. 인터넷 검색");
		int i = sc.nextInt();
		return i;
	
	}

}

