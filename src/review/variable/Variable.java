package review.variable;

public class Variable {
    public static void main(String[] args) {
        int num = 10;
        // 같은 텍스트 선택은 Alt + J

        String name = "가나다";
        double b = 0.5;
        char a = 'a';
        boolean d = true; // false

        byte byte01 = 1; // -128 ~ 127 8bit -> 1byte
        short short01 = 1; // 16bit -> 2byte
        int int01 = 1; // 32bit -> 4byte 정수는 int를 기본으로 한다.
        long long01 = 1L; // 64bit -> 8byte
        float float01 = 0.1313f; //
        double double01 = 0.1313; // 실수는 double를 기본으로 한다

        System.out.println(b);
        System.out.println(a);
        System.out.println(d);
        System.out.println(num);

    }
}
