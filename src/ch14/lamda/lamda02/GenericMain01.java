package ch14.lamda.lamda02;

public class GenericMain01 {
    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String result = upperCase.apply("hello");
        System.out.println("result = " + result);

        NumberFunction square = n -> n * n;
        Integer result01 = square.apply(10);
        System.out.println("result01 = " + result01);
    }
    @FunctionalInterface
    interface StringFunction{
        String apply(String s);
    }
    @FunctionalInterface
    interface NumberFunction{
        Integer apply(Integer s);
    }


}
