package Java_1204;

public class Index_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str_1 = "AB123";
		String str_2 = "AB34B";

		for (int i = 0; i < str_1.length(); i++) {
			System.out.println(str_1.substring(i, i +1));
		
			String a = str_1.substring(i, i + 1);
			
			if(a.contains("0") || a.contains("1")||a.contains("2")||a.contains("3")||
					a.contains("4")||a.contains("5")||a.contains("6")||a.contains("7")||a.contains("8")||a.contains("9"))
				System.out.println("숫자가 포함되어 있습니다.");
			}
		for (int j = 0; j < str_2.length(); j++) {
			System.out.println(str_2.substring(j, j +1));
			String b = str_2.substring(j, j + 1);
			
			if(b.contains("0") || b.contains("1")||b.contains("2")||b.contains("3")||
					b.contains("4")||b.contains("5")||b.contains("6")||b.contains("7")||b.contains("8")||b.contains("9"))
				System.out.println("숫자가 포함되어 있습니다.");
			}
		}

	}
