package Java_1217;

public class Bus {
	static int fee = 1200;
	
	Bus_card bc = new Bus_card();
	
	
	public Bus() {
		
	}
	public static void reader(int bus_card) {
		bus_card = bus_card -fee;
		
		//return bus_card;
	}

}
