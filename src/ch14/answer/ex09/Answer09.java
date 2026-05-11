package ch14.answer.ex09;

import java.util.List;
import java.util.stream.Stream;

public class Answer09 {
    public static void main(String[] args) {
        List<String>names= List.of("Kim","Lee","Park","Choi");
        List<String> stream = names.stream()
                .map(s -> s.substring(0, 1)).toList();

        System.out.println("stream = " + stream);
    }
}
