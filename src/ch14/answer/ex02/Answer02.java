package ch14.answer.ex02;

import java.util.List;

public class Answer02 {
    public static void main(String[] args) {
        List<String>words= List.of("apple","kiwi","banana","fig","grape");
        List<String> stream = words.stream()
                .filter(s -> s.length() >= 5)
                .toList();
        System.out.println("stream = " + stream);
    }
}
