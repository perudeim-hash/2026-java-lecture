package ch10.review;

import java.util.Scanner;

public class MainTest03 {
    public static void main(String[] args) {
        NetworkService03 service = new NetworkService03();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : "  );
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            service.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료 합니다.");

    }
}
