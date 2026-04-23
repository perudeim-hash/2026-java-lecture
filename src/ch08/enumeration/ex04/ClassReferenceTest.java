package ch08.enumeration.ex04;

public class ClassReferenceTest {
    public static void main(String[] args) {
        System.out.println("Grade.BASIC = " + Grade.BASIC.getClass());
        System.out.println("Grade.GOLD = " + Grade.GOLD.getClass());
        System.out.println("Grade.DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("reference BASIC = " + System.identityHashCode(Grade.BASIC));
        System.out.println("reference BASIC = " + System.identityHashCode(Grade.GOLD));
        System.out.println("reference BASIC = " + System.identityHashCode(Grade.DIAMOND));

    }
}
