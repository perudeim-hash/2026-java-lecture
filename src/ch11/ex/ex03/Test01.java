package ch11.ex.ex03;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> stringHashMap = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.");
        String input;
        String name;
        String ingu;
        while (true) {

            input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            System.out.println("나라이름과 인구가 입력됐습니다.");
            String[] arr = input.split(" ");
            name = arr[0];
            ingu = arr[1];
            stringHashMap.put(name, ingu);
        }


        while (true) {
            System.out.println("인구 검색");
            input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            if (stringHashMap.containsKey(input)) {
                System.out.println(input + " 의 인구는 : " + stringHashMap.get(input));
            } else {
                System.out.println(input + " 나라는 없습니다.");
            }
        }


    }
}
