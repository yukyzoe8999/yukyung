package Java_1221;

public class Ev {
	static int MAX = 100;
	
	public int ev_weight(int i) {
		if(i>=MAX) {
			System.out.println("최대무게");
		} else { System.out.println(i);
		
		}
		return i;
	}
	public int ev_floor(int j) {
		System.out.println("1층~10층");
		if(j<1||j>10) {
			System.out.println("잘못입력");
		} else {
			System.out.println(j+"층");
		}
		return j;	
	}

}
