package ch03.answer;

public class Answer01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
