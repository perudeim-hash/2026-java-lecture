package ch03.answer2;

import java.util.Scanner;

public class Answer04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력 하시오");

        char sc =  scanner.next().charAt(0);
        for (char i = sc; i >= 'a'; i--) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
