package ch11.ex.ex03;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> stringHashMap = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.");
        String input;
        while (true) {
            input = scanner.next();
            if (input.equals("그만")) {
                break;
            }
            Integer population = scanner.nextInt();
            stringHashMap.put(input, population);
        }

        System.out.println("인구 검색");
        while (true) {
            input = scanner.next();
            if (input.equals("그만")) {
                break;
            }
            Integer population = stringHashMap.get(input);
            if (population == null){
                System.out.println(input + " 나라는 없습니다.");
            }
            System.out.println(input + "의 인구는 : " + population);
        }


    }
}
