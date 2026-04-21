package ch07.lang.immutable.String;

public class StringImmutable01 {
    public static void main(String[] args) {
        String str01 = "hello";
        str01.concat(" java");
        System.out.println("str01 = " + str01);

        System.out.println("=======================");
        String str02 = str01.concat(" java");
        System.out.println("str02 = " + str02);

    }
}
