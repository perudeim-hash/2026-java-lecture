package ch14.lamda.lamda03;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> supplier01 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(10);
            }
        };
        System.out.println(supplier01.get());

        Supplier<Integer> supplier02 = () -> new Random().nextInt(10);
        System.out.println(supplier02.get());
    }
}
