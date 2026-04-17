package review.memory;

public class Memory01 {
    public static void main(String[] args) {
        System.out.println("main start");
        method01(10);
        System.out.println("main end");

    }

    static void method01(int m1) {
        System.out.println("method01 start");
        int cal = m1 * 2; // 매개 변수, 지역 변수는 Stack 영역에서 관리한다.
        method02(cal);
        System.out.println("method01 end");

    }
    static void method02(int m2) {
        System.out.println("method02 start");
        System.out.println("method02 end");

    }

}
