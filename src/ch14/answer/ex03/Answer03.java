package ch14.answer.ex03;

import java.util.List;

public class Answer03 {
    public static void main(String[] args) {
        List<String>names= List.of("kim","lee","park");
        List<String> stream = names.stream()
                .map(s -> s.toUpperCase())
                .toList();
        System.out.println("stream = " + stream);
    }
}
