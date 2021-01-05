package Java_1221;

public class EV_1 {
	int MAX;
	int floor;
	int weight;
	

	public int getFloor() {
		return floor;
	}
	public int setFloor(int floor) {
		return this.floor = floor;
		
	}
	public int setweight(int weight) {
		this.MAX = 100;
		
		if(weight>MAX) {
			System.out.println("정원초과");
		} else {
			System.out.println(floor+"층에 도착");
		}
		return weight;
	}
	

}
