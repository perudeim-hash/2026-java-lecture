package review.scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("문자열을 입력하세요 / exit를 입력하면 종료합니다.");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }
            System.out.println(str);

        }


    }
}
