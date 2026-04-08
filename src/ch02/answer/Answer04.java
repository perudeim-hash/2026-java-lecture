package ch02.answer;

public class Answer04 {
    public static void main(String[] args) {

        int a = 40, b = 20, c = 30;
        int center = 0;
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            center = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            center = b;
        } else {
            center = c;
        }

        System.out.println("세 숫자 " +"a = " +  a + " b = " + b + " c = " + c +"의 center = " + center);
    }
}
