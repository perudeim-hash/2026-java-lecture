package ch03.answer2;

import java.util.Scanner;

public class Answer06 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();

        int[] won = {50000, 10000, 5000, 1000, 500, 100, 10, 1};

        for (int i = 0; i < won.length; i++) {
            int j = money / won[i];
            System.out.println(won[i] + "원 권은 " + j + " 매 입니다.");
            money = money - j * won[i];
        }
    }
}
