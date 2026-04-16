package review.scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력 하세요");
        int i = scanner.nextInt();
        System.out.println("입력하신 정수는 = " + i);

    }
}
