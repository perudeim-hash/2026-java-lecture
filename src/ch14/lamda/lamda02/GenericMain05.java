package ch14.lamda.lamda02;

import java.util.function.Function;

public class GenericMain05 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result = upperCase.apply("hello jaaaaava");
        System.out.println("result = " + result);

        Function<Integer, Integer> square = n -> n * n;
        Integer result02 = square.apply(200);
        System.out.println("result02 = " + result02);

        Function<Integer, Boolean> isEven = num -> num % 2 == 0;
        Boolean result03 = isEven.apply(10);
        System.out.println("result03 = " + result03);

    }
    
}
//Function 입력이 있고 반환이 있을때 apply()
//Consumer 입력은 있고 반환이 없을때 accept()
//Supplier 입력은 없고 반환만 있를때 get()
//Runnable(Thread 전용) 입력도 없고 반환만 있을때 run()