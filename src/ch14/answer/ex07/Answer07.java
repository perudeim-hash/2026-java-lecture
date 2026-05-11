package ch14.answer.ex07;

import java.util.List;
import java.util.stream.Stream;

public class Answer07 {
    public static void main(String[] args) {
        List<Integer>nums = List.of(10,20,30,40,50);
        int stream = nums.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println("stream = " + stream);
    }
}
