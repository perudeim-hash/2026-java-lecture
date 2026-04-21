package ch07.lang.object.toString;

public class ObjectPrinter {
    public static void print(Object object) {
        String string = "매개 변수로 넘겨받은 객체 정보 출력" + object.toString();
        System.out.println(string);
    }

}
// 추상적인 것에 의존한다.