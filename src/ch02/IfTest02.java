package ch02;

import java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("학년을 입력하세요");
        int year = scanner.nextInt();
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();

        if (year == 4) {
            if (score >= 70) {
                System.out.println( year+"학년 합격입니다." + score);

            } else {
                System.out.println(year +"학년 불합격 입니다." + score);
            }
        } else if (score >= 60) {
            System.out.println(year+  "합격입니다." + score);
        } else {
            System.out.println(year+ "불합격 입니다." + score);
        }


    }
}
