package ch14.answer.ex04;

import java.util.List;

public class Answer04 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> stream = nums.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("stream = " + stream);
    }
}
