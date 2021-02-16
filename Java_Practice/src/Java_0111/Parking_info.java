package Java_0111;

public class Parking_info {

	private String number;
	private String time;
	private int fee;

	public Parking_info(String number, String time) {
		this.number = number;
		this.time = time;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}
