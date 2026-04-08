package ch03;

import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("end를 쓰면 종료됩니다.");
        while (true) {
            System.out.println("채팅===========>");
            String msg =  scanner.nextLine();
            if (msg.equals("end")) {
                break;
            }
            if (msg.equals("pass")) {
                System.out.println("사용자가 메시지를 넘겼습니다.");
                continue;
            }
            System.out.println(msg);
        }
    }
}
