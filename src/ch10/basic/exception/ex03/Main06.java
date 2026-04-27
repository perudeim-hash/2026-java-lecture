package ch10.basic.exception.ex03;


import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) throws NetworkClientException01 {
        NetworkService06 networkService = new NetworkService06();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송할 문자 : " + " 종료(exit)");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
