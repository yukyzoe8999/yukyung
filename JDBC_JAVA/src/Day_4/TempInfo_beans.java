package Day_4;

public class TempInfo_beans {
	private String date;
	private int temp;
	
	public TempInfo_beans(String date, int temp) {
		this.date = date;
		this.temp = temp;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	
}

