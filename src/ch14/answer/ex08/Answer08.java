package ch14.answer.ex08;

import java.util.List;

public class Answer08 {
    public static void main(String[] args) {
        List<String>words= List.of("apple","banana","kiwi","grape","avocado");
        long stream = words.stream()
                .filter(s -> s.contains("a"))
                .count();
        System.out.println("stream = " + stream);
    }
}
