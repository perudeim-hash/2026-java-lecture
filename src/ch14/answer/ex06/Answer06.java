package ch14.answer.ex06;

import java.util.List;

public class Answer06 {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Berry", "Tomato");
        List<String> stream = words.stream()
                .filter(s -> s.startsWith("B"))
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println("stream = " + stream);
    }
}
