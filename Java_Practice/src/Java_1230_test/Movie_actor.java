package Java_1230_test;

public class Movie_actor extends Movie{
	String movie_actor="이름 재정의";
	
	public void actor(String actor) {
		this.movie_actor = "이름 재정의";
	}
	@Override public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}
	
}
