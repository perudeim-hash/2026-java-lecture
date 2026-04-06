public class TypeTest {
    public static void main(String[] args) {
        // Java 기본 타입 8개
//        boolean isBool = false , true
        char ch = 'j'; // 문자 1개만
        byte b = 127;
        short sh = 20000;
        int num  = 888_989_899;
        long ln = 1299890208889778L;
        float num_float = 0.2f;
        double num_double = 0.44;
//        String str = "전세진";

        char ch02 = 65;
        char ch03 = 177;
        System.out.println(ch03); //형 변환(type Casting)

        String strNull = null;
        /*리터럴은 프로그래밍에서 사용하는 재료
        * 주로 숫자 / 문자 등 하나의 값으로 인식된다.*/
//        System.out.println(strNull);
        var myVar = "ㅁㄴㅇㅁㄴㅇ";

        int age = 30;
        age = 31;

        final double PI = 3.14;

        System.out.println(PI);

        int num04 = 10;
        System.out.println(num04 * 3.14);
        System.out.println(314/(double)10);
        
        System.out.println((int)2.9); 
        // -> 소수점은 날려버려서 2가 나온다. 작은 타입은 큰 타입에 대입이 가능하다. 이 때 아무런 영향을 받지 않는다.
        byte b02 = (byte) num04;
        // 큰 타입을 작은 타입으로 넣을때는 형변환 필요한데 이때 값의 손실이 일어난다.
        System.out.println(num04);
    
    }
}
