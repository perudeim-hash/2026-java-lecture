package ch08.enumeration.answer.ex02;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
//        Grade userGrade = Grade.GOLD;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Grade grade = Grade.valueOf(input);

        switch (grade) {
            case BASIC -> System.out.println("베이직 회원 입니다.");

            case GOLD -> System.out.println("골드 회원 입니다.");

            case DIAMOND -> System.out.println("다이아몬드 회원 입니다.");

        }
    }
}
