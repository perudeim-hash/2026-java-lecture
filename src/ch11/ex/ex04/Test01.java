package ch11.ex.ex04;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        // 길이가 정해져있지 않을때(가변) 사용한다
        Scanner scanner = new Scanner(System.in);
        System.out.println("강수량 입력");
        int total = 0;
        int count;
        while (true) {
            int list = scanner.nextInt();
            if (list == 0) {
                break;
            }
            System.out.println("강수량이 입력됐습니다.");
            integerList.add(list);

            total += list;
            count = integerList.size();
            System.out.println(integerList);
            System.out.println("현재 평균 : " + total/count);

        }


    }
}
