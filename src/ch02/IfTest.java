package ch02;

public class IfTest {
    public static void main(String[] args) {

        /**
    int num = 32894723;

        if (num % 3 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
         */

        int score = 77;

        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >=80) {
            System.out.println("B학점입니다.");
        } else if (score >=70) {
            System.out.println("C학점입니다.");
        }else {
            System.out.println("과락입니다.");
        }

    }
}
