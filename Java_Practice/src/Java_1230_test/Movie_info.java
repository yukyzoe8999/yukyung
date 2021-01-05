package Java_1230_test;

public class Movie_info extends Movie {
	String name="가나다라";
	String movie_Runtime="120분";
	public void info(String name, String Runtime) {
	 this.name = "가나다라";
	 this.movie_Runtime = "120분";
	}
	@Override public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	@Override public void setMovie_Runtime(String movie_Runtime) {
		this.movie_Runtime = movie_Runtime;
	}
	
	
}
