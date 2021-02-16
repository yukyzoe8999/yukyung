package Java_0118;

import java.util.ArrayList;
import java.util.Random;

public class Temperature {
   ArrayList<Temperature_info> temper_month = new ArrayList<Temperature_info>();
   ArrayList<Integer> temper_week2 = new ArrayList<Integer>();
   int sum = 0;

   public void week_input() {
      Random rdm = new Random();
      int a = 0;
      int day = 0;

      for (int j = 0; j < 4; j++) {
         for (int i = 1; i < 8; i++) {
            a = rdm.nextInt(30) - 15;
            temper_week2.add(day, a);
            day++;
         }
         temper_month.add(new Temperature_info(temper_week2));
         // System.out.println(temper_week2);
         // System.out.println(temper_month);

      }
   }

   public void month() {

      System.out.println(temper_month.toString());
      System.out.println("1주차" + temper_month.get(0));
      System.out.println("2주차" + temper_month.get(1));
      System.out.println("3주차" + temper_month.get(2));
      System.out.println("4주차" + temper_month.get(3));
   }

   public void avg(int aa) {
      for (int i = 0; i < 7; i++) {
         String a = temper_month.get(aa - 1).toString();
         for (int j = 0; j < 7; j++) {
            String b = a.substring(j);
            int num = Integer.parseInt(b);
            sum += num;
         }
      }
   }
}
