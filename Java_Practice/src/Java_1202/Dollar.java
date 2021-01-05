
		package Java_1202;

		import java.util.Scanner;

		public class Dollar {

			public static void main(String[] args) {
				try (// TODO Auto-generated method stub
						Scanner sc = new Scanner(System.in)) {
					System.out.println("내가 바꿀 돈");
					 int won = sc.nextInt();
					 System.out.println("현재 환율");
					 int exchange =sc.nextInt();
					 
					 double dollar = (double)won/(double)exchange;
					 double dollar_1 = (double)won%(double)exchange;
					 int dollar_e = (int)dollar;
					 int dollar_b = (int)dollar_1;
					 
					 System.out.println("환전한 금액"+dollar_e+"달러");
					System.out.println("환전하지 못한 금액"+dollar_b+"원");
							 
							 
							 
							 
					 
		
					 
				}
			}
		}
					
	