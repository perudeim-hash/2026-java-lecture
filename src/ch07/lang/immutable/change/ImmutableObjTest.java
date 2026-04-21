package ch07.lang.immutable.change;

public class ImmutableObjTest {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);

        ImmutableObj changeImmutableOjb = immutableObj.add(20);
        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("changeImmutableOjb.getValue() = " + changeImmutableOjb.getValue());

    }
}
