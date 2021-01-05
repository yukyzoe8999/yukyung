package Java_1215;

import java.util.Scanner;

public class Review_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("영화 장르를 골라주세요.\n " + "1. SF 2. 액션 3. 로맨스");
		int a = sc.nextInt();
		String movie_title[] = new String[5];

		if (a == 1) {
			movie_title = select_SF();
//			for(String k : movie_title)				
//			System.out.println(k);
		} else if (a == 2) {
			movie_title = select_ACTION();
//			for(String k : movie_title)				
//				System.out.println(k);
		} else if (a == 3) {
			movie_title = select_ROMANCE();
//			for(String k : movie_title)				
//				System.out.println(k);
		}
		for(String k : movie_title)				
		System.out.println(k);

	}

	private static String[] select_ROMANCE() {
		// TODO Auto-generated method stub
		String movie_title[] = { "ROMANCE_1", "ROMANCE_2", "ROMANCE_3", "ROMANCE_4", "ROMANCE_5" };

		return movie_title;
	}

	private static String[] select_ACTION() {
		// TODO Auto-generated method stub
		String movie_title[] = { "ACTION_1", "ACTION_2", "ACTION_3", "ACTION_4", "ACTION_5" };

		return movie_title;
	}

	public static String[] select_SF() {
		// TODO Auto-generated method stub

		String movie_title[] = { "SF_1", "SF_2", "SF_3", "SF_4", "SF_5" };

		return movie_title;
	}

}
