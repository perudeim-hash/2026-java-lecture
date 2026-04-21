package ch07.lang.immutable.address;

public class ReferenceTest01 {
    public static void main(String[] args) {

        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // 사이드 임팩트 side effect
        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
