package Java_1217;

public class Book {
	String title = "채식주의자";
	String writer = "한강";
	int page = 360;
	int readed =0;
	String note = "채식주의자는!";
	
	public void reader(int readed) {
			
		this.readed = this.page - readed;
		
	}


}
