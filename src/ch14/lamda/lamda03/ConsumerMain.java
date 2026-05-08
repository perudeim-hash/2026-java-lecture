package ch14.lamda.lamda03;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> consumer01 = s -> System.out.println(s);
        consumer01.accept("hello02");

    }
}
