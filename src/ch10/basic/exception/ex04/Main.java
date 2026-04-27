package ch10.basic.exception.ex04;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NetworkClientException {
        NetworkService networkService = new NetworkService();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송할 문자 : " + " 종료(exit)");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandling(e);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }

    private static void exceptionHandling(Exception e) {
        System.out.println("============ Error =============");
        e.printStackTrace();
        if (e instanceof SendException sendException) {
            System.out.println("전송 오류 :" + sendException.getSendData());
        } else if (e instanceof ConnectException connectException) {
            System.out.println("접속 오류 : " + connectException.getAddress());
        }
    }
}
