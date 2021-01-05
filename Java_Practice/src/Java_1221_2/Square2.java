package Java_1221_2;

public class Square2 {
    public static void printSquare(int x) {
        System.out.println(x * x);
    }
    public static void main(String[] args) {
        printSquare(3); // 인트형으로 바꿔줌
        printSquare(55); // 인트형이기때문에 소수점 안됨
    }
}
