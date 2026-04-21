package ch07.lang.wrapper;

public class AutoboxingTest {
    public static void main(String[] args) {
        int value = 9;
        // Primitive ===> Wrapper
        Integer boxedValue = Integer.valueOf(value);

        Integer boxedValue01 = 5; // << 최신 유행하는거

        // Wrapper ===> Primitive
        int unboxedValue = boxedValue.intValue();
        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);
    }
}
