package Java_1204;

public class Contains_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Yang!Jung";
		
		boolean con =str.contains("yang");
		System.out.println("Yang값이 있는가?" +con);
		

		if(str.indexOf("!")!=-1 || str.indexOf("%")!=-1|| str.indexOf("#")!=-1 || str.indexOf("*")!=-1) {
			System.out.println("다시 입력해주세요.");
		}
		
		int i = str.indexOf("!");
		System.out.println("인덱스 값 : " + i);
		
		

	}

}
