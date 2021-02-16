package Java_0111;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Parking {

	//Parking_info information = new Parking_info();
	ArrayList<Parking_info> park_array = new ArrayList<Parking_info>();
	int count = 0;

	public void input() {
		Scanner sc = new Scanner(System.in);
		String number;
		String time;

		System.out.println("자동차 번호를 입력해 주세요");
		number = sc.nextLine();
		time = Datetime();
		System.out.println("현재시간: " + time);
		System.out.println("기본 요금은 1000원 입니다.");
		
		park_array.add(new Parking_info(number, time));
		count++;

	}

	public void print_info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 번호를 입력해 주세요");
		String num2 = sc.nextLine();

		for (int i = 0; i < count; i++) {
			if (park_array.get(i).getNumber().equals(num2)) {
				System.out.println(park_array.get(i));
				System.out.println("현재시간: " + Datetime());
			}
		}

	}

	public String Datetime() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd :HH:mm:ss");
		Calendar time = Calendar.getInstance();
		String format_time1 = format1.format(time.getTime());
		return format_time1;
	}


}
