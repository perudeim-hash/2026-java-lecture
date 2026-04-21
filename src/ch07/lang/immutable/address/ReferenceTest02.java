package ch07.lang.immutable.address;

public class ReferenceTest02 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // 사이드 임팩트 side effect
        b = new ImmutableAddress("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
