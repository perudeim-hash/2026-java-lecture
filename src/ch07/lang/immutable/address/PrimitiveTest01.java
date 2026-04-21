package ch07.lang.immutable.address;

public class PrimitiveTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
