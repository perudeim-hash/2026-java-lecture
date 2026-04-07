package ch02.answer;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/**
 *  1
        int won = scanner.nextInt();
        System.out.println(won / 1500 + " $ 입니다." + "나머지는 " + won % 1500 + "원 입니다.");
*/
/**  2
        int num = scanner.nextInt();
        if (num / 10 == num % 10) {
            System.out.println("10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
        }
*/
/** 3
        int money = scanner.nextInt();
        int[] won = {50000, 10000, 5000, 1000, 500, 100, 10, 1};
        for (int i = 0; i < won.length; i++) {
            int j = money / won[i];
            System.out.println(won[i]+ "원 권은 " + j + " 매 입니다.");
            money = money - j * won[i];
        }
*/
/** 4
        System.out.println("===== 4 =====");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] list = {a, b, c};
        Arrays.sort(list);
        System.out.println(list[1]);

*/
/** 5
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] list = {a, b, c};
        Arrays.sort(list);

        if (list[0] + list[1] > list[2]) {
            System.out.println("삼각형이 됩니다");
        }else {
            System.out.println("삼각형이 안 됩니다.");
        }
 */

        int num = scanner.nextInt();
        int num1 = 3;
        int num2 = 6;
        int num3 = 9;
        if (num / 10 == num1) {
            System.out.println("박수짝");
        }





    }
}
