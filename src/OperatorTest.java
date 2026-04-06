public class OperatorTest {
    public static void main(String[] args) {

        // 산술연산 +,-,*,/,%
//        System.out.println(10 + 10);
//        System.out.println(10 - 5);
//        System.out.println(10 * 10);
//        System.out.println(10 / 5);
//        System.out.println(10 % 2);

        int time = 5000;

        int sc = time % 60;
        int min = time / 60 % 60;
        int hour = time / 60 / 60;
        System.out.println(hour +  "시간 " + min +  " 분" + sc + "초");

        System.out.println("==============================================================================");

        int a = 1;
        int b = 1;
        a = a + 1;
        a += 1;
        a++; // 후위 증감 연산자

        int c = ++a; // 선위 증감 연산자
        System.out.println(a);

        System.out.println(a + "===" + c);

        int d = 5;
        int e = 3;
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d <= e);
        System.out.println(d >= e);
        System.out.println(d == e);
        System.out.println(d != e);
        // 논리 연산
        System.out.println(!(5 > 3)); // ! -> NOT 연산자
        System.out.println(!true);
        System.out.println( 5 > 3 || 5 < 3); // || -> OR 연산자
        System.out.println( 5 > 3 && 5 < 3); // && -> AND 연산자
        System.out.println( 5 > 3 ^ 5 < 3); // ^ -> XOR 연산자








    }

}
