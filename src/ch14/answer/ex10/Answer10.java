package ch14.answer.ex10;

import java.util.List;

public class Answer10 {
    public static void main(String[] args) {
        List<Integer>nums= List.of(12,3,7,9,15,2,30,21);
        List<Integer> stream = nums.stream()
                .filter(n -> n % 3 == 0)
                .sorted()
                .toList();

        System.out.println("stream = " + stream);
    }
}
