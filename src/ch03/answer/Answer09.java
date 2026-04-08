package ch03.answer;

public class Answer09 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                continue;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();


        }



    }
}
