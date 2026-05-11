package ch14.answer.ex05;

import java.util.List;

public class Answer05 {
    public static void main(String[] args) {
        List<String> names = List.of("Kim", "Lee", "Park", "Choi");
        List<Integer> stream = names.stream()
                .map(s -> s.length())
                .toList();
        System.out.println("stream = " + stream);
    }
}
