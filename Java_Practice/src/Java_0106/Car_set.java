package Java_0106;

import java.util.Scanner;

public class Car_set {
	private Information info[];
	private int count;
	String carcar[] = { "소나타", "그랜저", "벤츠" };
	
	public Car_set() {
		this.info = new Information[5];
		this.count = 0;
	}
	
	public void setset(String name,String car,String Pnumber ) {
		Scanner sc = new Scanner(System.in);
		Information t = new Information();
		car = sc.nextLine();
		for (int i = 0; i < carcar.length; i++) {
			String k = carcar[i];
			if (car.equals(k)) {
				t.setCar(car);
			}					
		}
		t.setName(name);
		t.setPnumber(Pnumber);
		
		info[count] = t;
		count++;
	}
	public int num(int count) {
		return count;
	}
	public Information infom(int i) {
		return info[i];
	}
}

