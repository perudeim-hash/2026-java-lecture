package ch07.lang.immutable.String;

public class StringBasicTest {
    public static void main(String[] args) {

        String str01 = "hello";
        String str02 = new String("hello");
        System.out.println("str01 = " + str01);
        System.out.println("str02 = " + str02);
        System.out.println(str01 + "===" + str02);
        System.out.println(str01 == str02);
        System.out.println(str01.equals(str02));

        System.out.println(System.identityHashCode(str01));
        System.out.println(System.identityHashCode(str02));

        String str03 = "java"; // String pool
        String str04 = "java";
        System.out.println(str03 + "===" + str04);
        System.out.println(str03 == str04);
        System.out.println(System.identityHashCode(str03));
        System.out.println(System.identityHashCode(str04));

    }

}