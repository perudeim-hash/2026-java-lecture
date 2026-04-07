package ch02.answer;

import java.util.Scanner;

public class Answer01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        double dollar = won/(double)1500;

        System.out.printf("%d원 은 $%.3f 입니다.", won, dollar);

    }
}
