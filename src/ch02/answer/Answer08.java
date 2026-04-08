package ch02.answer;

public class Answer08 {
    public static void main(String[] args) {

        double a = 12;
        double b = 20;
        double result = 0;

        String operator = "*";

        if (operator == "+") {
            result = a + b;
            System.out.println(result);

        } else if (operator == "-") {
            result = a - b;
            System.out.println(result);

        } else if (operator == "*") {
            result = a * b;
            System.out.println(result);

        } else {
            if (a == 0 || b == 0 ) {
                System.out.println("0으로 나눌 수 없습니다.");

            }
            result = a / b;
            System.out.println(result);

        }
    }
}
