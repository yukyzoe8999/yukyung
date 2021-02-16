package Java_0106;

public class Exam {
	 private int kor;
	 private int eng;
	 private int math;

	public Exam(int kor, int eng, int math) {
		 this.kor = kor;
		 this.eng = eng;
		 this.math = math;
	 }
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
//	public int gettotal(int kor, int eng, int math) {
//		int total = kor+eng+math;
//		return total;
//	}
//	public double getavg(int kor, int eng, int math) {
//		double avg = kor+eng+math / 3.0;
//		return avg;
//	}
//	public int gettotal() {
//		int total = kor+eng+math;
//		return total;
//	}
//	public double getavg() {
//		double avg = (kor+eng+math) / 3.0;
//		return avg;
//	}
	
}
