package ch02.answer;

import java.util.Scanner;

public class Answer02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        if (num / 10 == num % 10) {
            System.out.println("10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
        }




    }
}
