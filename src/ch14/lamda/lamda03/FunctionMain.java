package ch14.lamda.lamda03;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<String, Integer> function01 = s -> s.length();
        System.out.println("function01 = " + function01.apply("hello"));
     }
}
