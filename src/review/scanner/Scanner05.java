package review.scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int total = 0;
        double average = 0;
        while (true) {
            System.out.println("첫 번째 숫자를 입력해 주세요.");
            num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            System.out.println("두 번째 숫자를 입력해 주세요.");
            num = scanner.nextInt();
            sum += num;
            System.out.println("세 번째 숫자를 입력해 주세요.");
            num = scanner.nextInt();
            sum += num;
            System.out.println("네 번째 숫자를 입력해 주세요.");
            num = scanner.nextInt();
            sum += num;

            total = sum;
            average = sum / 4;
            System.out.println("입력한 숫자들의 합은 : " + total);
            System.out.println("입력한 숫자들의 평균은 : " + average);
            sum = 0;
        }


    }
}
