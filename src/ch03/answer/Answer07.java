package ch03.answer;

public class Answer07 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                int num = i * j;
                if (num % 2 == 1) {
                    continue;
                }
                System.out.println(i + "*" + j + " : " + num);
            }
            System.out.println();
        }
    }
}
