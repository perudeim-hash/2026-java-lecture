package ch14.lamda.lamda02;

import java.util.Objects;

public class GenericMain02 {
    public static void main(String[] args) {
        ObjectFunction upperCase01 = s -> ((String) s).toUpperCase();
        Object result01 = upperCase01.apply("hello");
        System.out.println("result01 = " + result01);


        ObjectFunction upperCase02 = s -> ((String) s).toUpperCase();
        String result02 = (String) upperCase02.apply("hello");
        System.out.println("result02 = " + result02);


        ObjectFunction square = n -> (Integer) n *(Integer) n;
        Integer result03 = (Integer) square.apply(10);
        System.out.println("result03 = " + result03);
    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }


}
