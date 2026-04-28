package ch11.ex.ex01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//1. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 List에 저장하고
//List를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("정수를 입력해 주세요.");

        while (true) {
            try {
                int num = scanner.nextInt();
                if (num == -1) {
                    break;
                }
                list.add(num);
                System.out.println("정수가 입력 되었습니다.");

            } catch (InputMismatchException e) {
                System.out.println("정수만 입력하세요.");
                scanner.next();
            }
        }

            int max = list.get(0);

            for (Integer nums : list) {
                if (max < nums) {
                    max = nums;
                }

            }
            System.out.println("가장 큰 수는? : " + max);

    }
}
