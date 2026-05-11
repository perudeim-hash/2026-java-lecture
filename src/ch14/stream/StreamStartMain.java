package ch14.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        // Stream -->
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");
        Stream<String> stream = names.stream();
//        List<String> result = stream.filter(s -> s.startsWith("B")).toList();
        List<String> result = stream
                                    .filter(s -> s.startsWith("B")) // filter, map 은 중간 연산
                                    .map(s -> s.toUpperCase())
                                    .toList(); // 최종 연산
        System.out.println("result = " + result);
//        Stream<String> result02 = result.map(s -> s.toUpperCase());
//        System.out.println("result02 = " + result02.toList());
        System.out.println("============================내부 for문===============");
//        Stream에서 나오는 결과는 불변값으로 나온다.
        names.stream()
                .filter(s -> s.startsWith("B"))// filter, map 은 중간 연산
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));// 최종 연산

        System.out.println("==========================Method 참조======================");
        names.stream()
                .filter(s -> s.startsWith("B"))// filter, map 은 중간 연산
                .map(String::toUpperCase)
                .forEach(System.out::println);// 최종 연산
    }
}
