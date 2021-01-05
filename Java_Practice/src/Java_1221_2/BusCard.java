package Java_1221_2;

import java.util.Scanner;
public class BusCard {
    public static String getRole(int age) {
        /* 이곳을 작성해주세요 */
    	String role = "";
    if(age>=18) {
    	role = "성인";
    } else if(age>=13&&age<17) {
    	role = "청소년";
    } else if (age>=6&&age<13) {
    	role = "어린이";
    } else if (age<=5) {
    	role = "유아";
    }
        return role;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        int age = input.nextInt();
        String role = getRole(age);
        System.out.println(role);
    }
}
