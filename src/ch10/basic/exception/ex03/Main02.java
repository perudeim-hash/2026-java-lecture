package ch10.basic.exception.ex03;


import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) throws NetworkClientException01 {
        NetworkService02 networkService02 = new NetworkService02();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송할 문자 : " + " 종료(exit)");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService02.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
