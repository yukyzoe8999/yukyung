package Java_1221_2;

public class JavaCorporation {
	  public static void printPay(double basePay, int hours) {
	        // 메소드를 구현하세요..
		  double pay;
		  double weekpay = basePay*7;
		  double weekhours = hours*7;
		  if(weekhours>40) {
			double pay_2 = (weekpay-40)*basePay*(1.5);
			pay = weekpay+weekhours+pay_2;
			System.out.println("$"+pay);
		  } else if(weekhours<=40) {
			  pay = weekpay+weekhours;
				System.out.println("$"+pay);

		  }
		  if(basePay<8.0) {
			  System.out.println("ERROR: 최저시급 불이행");
		  }
		  if(weekhours>60) {
			  System.out.println("ERROR: 제한 근무시간 초과.");
		  }
	    }
	    public static void main(String[] args) {
	        printPay(7.50, 35);
	        printPay(8.20, 47);
	        printPay(10.00, 73);
	    }
	}


