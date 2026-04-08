package ch03.answer;

public class Answer03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.print(i);
            sum = sum + i;
            System.out.println();
        }
        System.out.println("sum = " + sum);

    }
}
