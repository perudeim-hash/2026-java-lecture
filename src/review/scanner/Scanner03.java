package review.scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("정수를 입력 하세요. 0을 입력하면 종료하고 입력한 숫자의 합을 보여드립니다.");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("입력한 값의 합은 : " + sum);
    }
}
