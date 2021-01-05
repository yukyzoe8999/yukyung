package Java_1217;

public class Elev {
	static int floor = 0;
	
	public Elev(int floor) {
		this.floor = floor;
	}
	
	public static void up(int up) {
		floor = up;
		System.out.println(floor);
	}
	public static void down() {
		
	}

}
