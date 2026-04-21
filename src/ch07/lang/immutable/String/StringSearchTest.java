package ch07.lang.immutable.String;

public class StringSearchTest {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java World";
        System.out.println("문자열에 Java 가 포함되어 있는지 : " + str.contains("Java"));
        System.out.println("Java의 첫번째 index : " + str.indexOf("Java"));
        System.out.println("Java의 첫번째 index : " + str.lastIndexOf("Java"));

    }
}
