package Java_0118;

import java.util.Scanner;

public class Calendar {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      Temperature tem = new Temperature();
      tem.week_input();
      
      while(true) {      
         System.out.println("1. 주차 온도 확인 2. 월별 온도 확인");
         int a = sc.nextInt();
         switch(a) {
         case 1:
            System.out.println("몇 주자 온도를 확인하시겠습니까? \n "+"1.1주차 2.2주차 3.3주차 4.4주차");
            int aa = sc.nextInt();
            switch(aa) {
            case 1:
               System.out.println("1주차 온도");
               System.out.println(tem.temper_month.get(0));
               break;
            case 2:
               System.out.println("2주차 온도");
               System.out.println(tem.temper_month.get(1));            
               break;
            case 3:
               System.out.println("3주차 온도");
               System.out.println(tem.temper_month.get(2));
               break;
            case 4:
               System.out.println("4주차 온도");
               System.out.println(tem.temper_month.get(3));
               break;
            }
            
            break;
         case 2:
            tem.month();
            break;
         }
      }
      
   }

}
