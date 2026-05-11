package ch14.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class InterMediatedOperationMain {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        // 1. filter
        System.out.println("짝수만 출력");
        List<Integer> WKrtn = nums.stream().filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 = " + WKrtn);
        // 2. map
        System.out.println("2. map 각 숫자를 제곱");
        List<Integer> wprhq = nums.stream().map(n -> n * n).toList();
        System.out.println("제곱 = " + wprhq);
        // 3. 중복 제거
        System.out.println("3. distinct를 이용해서 중복 제거");
        List<Integer> wndqhr = nums.stream().distinct().toList();
        System.out.println("중복 제거 = " + wndqhr);
        // 4. 정렬
        System.out.println("4. sorted 이용해서 정렬");
        List<Integer> wjdfuf = nums.stream().sorted().toList();
        System.out.println("정렬 = " + wjdfuf);
        // 5. 커스텀 정렬 sorted
        System.out.println("5. sorted 이용해서 커스텀 정렬 정렬");
        List<Integer> zjtmxjawjdfuf = nums.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("정렬 = " + zjtmxjawjdfuf);
        // 6. peek
        System.out.println("6. peek 동작을 확인");
        List<Integer> peek = nums.stream().peek(n -> System.out.print("before : " + n + ",")).map(n -> n * n).peek(System.out::println)
                .peek(n -> System.out.print("after : " + n + ",")).toList();
        System.out.println();
        System.out.println("동작 확인 " + peek);


    }
}
