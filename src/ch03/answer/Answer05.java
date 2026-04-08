package ch03.answer;

public class Answer05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("2와 3의 배수입니다. " + i);
            }
        }

    }
}
