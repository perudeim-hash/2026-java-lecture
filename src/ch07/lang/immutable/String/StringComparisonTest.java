package ch07.lang.immutable.String;

public class StringComparisonTest {
    public static void main(String[] args) {

        String str01 = "Hello, Java!";

        String str02 = "hello, java!";

        String str03 = "hello, world!";

        System.out.println("str01 equals str02 : " + str01.equals(str02));
        System.out.println("str01 equalsIgnoreCase str02 : " + str01.equalsIgnoreCase(str02));
        System.out.println("b compareTo a : " + "b".compareTo("b")); // 사전순 정의를 해서 나중에 나오면 양수 먼저 나오면 음수 같으면 0
        System.out.println("str01 compareTo str02 : " + str01.compareTo(str02)); // 사전순 정의를 해서 먼저 나오면 1 늦게 나오면 -1 같으면 0
        System.out.println("str01 compareToIgnore str02 : " + str01.compareToIgnoreCase(str02)); // 사전순 정의를 해서 먼저 나오면 1 늦게 나오면 -1 같으면 0

        System.out.println("=======================================================================================================");

        System.out.println("str01 starts with 'Hello : " + str01.startsWith("Hello")); // 특정 글자로 시작하는가
        System.out.println("str01 endsWith 'Java : " + str01.endsWith("Java!")); // 특정 글자로 끝나는가?

        System.out.println("str01 toLowerCase equalsIgnoreCase str02 : " + str01.toLowerCase().equalsIgnoreCase(str02.toLowerCase()));


    }
}
