package ch14.lamda.lamda03;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate01 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println("predicate01.test(10) = " + predicate01.test(10));
        // Predicate -> return 타입이 Boolean 밖에 없다. (특화형 함수형 인터페이스)
        Predicate<Integer> predicate02 = n -> n % 2 == 0;
        System.out.println("predicate02.test(11) = " + predicate02.test(11));

        Function<Integer,Boolean> predicate03 = n -> n % 2 == 0;
        System.out.println("predicate02.test(11) = " + predicate03.apply(11));

    }
}
