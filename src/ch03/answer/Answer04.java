package ch03.answer;

public class Answer04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수입니다. " + i);
            } else if (i % 2 != 0) {
                System.out.println("홀수입니다. " + i);
            }
        }

    }
}
