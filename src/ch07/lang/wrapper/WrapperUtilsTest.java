package ch07.lang.wrapper;

public class WrapperUtilsTest {
    public static void main(String[] args) {
//        int age = Integer.parseInt("10");
        Integer age = Integer.parseInt("10");   //  int 와 Integer의 차이는 Integer은 객체이기 때문에 여러가지의 .~~~ 을 사용 가능하다.

        System.out.println(age + 10);
        System.out.println(Integer.sum(10, 20));
        System.out.println(Integer.max(10, 20));
        System.out.println(Integer.min(10, 20));

        Integer integer01 = Integer.valueOf(10);
        Integer integer02 = Integer.parseInt("20");
        Integer integer03 = Integer.parseInt("30");
        Integer integer04 = Integer.parseInt("10");
        int compareResult = integer01.compareTo(30);
        int compareResult02 = integer01.compareTo(5);
        int compareResult03 = integer01.compareTo(10);
        System.out.println("compareResult = " + compareResult);
        System.out.println("compareResult02 = " + compareResult02);
        System.out.println("compareResult03 = " + compareResult03);
    }
}
