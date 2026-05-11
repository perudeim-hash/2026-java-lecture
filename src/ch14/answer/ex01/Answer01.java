package ch14.answer.ex01;

import java.util.List;
import java.util.stream.Stream;

public class Answer01 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> stream = nums.stream()
                            .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("stream = " + stream);
    }
}
