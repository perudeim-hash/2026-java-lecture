package ch14.lamda.start;

public class Ex01Main {
    static void helloJava() {
        System.out.println("Hello Java");
    }
    static void helloSpring() {
        System.out.println("Hello Spring");
    }

    static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");

    }
    public static void main(String[] args) {
//        helloJava();
//        helloSpring();
        hello("Hello Java");
        hello("Hello Spring");
    }

}
