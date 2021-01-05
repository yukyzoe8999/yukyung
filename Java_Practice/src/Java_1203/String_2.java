package Java_1203;

public class String_2 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String str1 = "양정개발센터";
		String str2 = new String("양정개발센터");
		String str3 = "양정개발센터";
		
		System.out.println("해시코드1: " +str1.hashCode());
		System.out.println("해시코드2: " +str2.hashCode());
		System.out.println("해시코드3: " +str3.hashCode());
		System.out.println("고유주소1: " + System.identityHashCode(str1));
		System.out.println("고유주소2: " + System.identityHashCode(str2));
		System.out.println("고유주소3: " + System.identityHashCode(str3));
		
		boolean compare1 = (str1 == str2);
		boolean compare2 = (str1.equals(str2));
		boolean compare3 = (str1 == str3);
		System.out.println("문자열 비교1: " + compare1);
		System.out.println("문자열 비교2: " + compare2);
		System.out.println("문자열 비교3: " + compare3);
		
		System.out.println(str1.hashCode());
		
	}

}
