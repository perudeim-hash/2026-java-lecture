package ch03.answer2;

import java.util.Scanner;

public class Answer03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력 하시오");

        int sc = scanner.nextInt();
        for (int i = sc; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
