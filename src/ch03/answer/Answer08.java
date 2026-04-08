package ch03.answer;

public class Answer08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
