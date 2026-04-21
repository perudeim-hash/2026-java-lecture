package ch07.lang.immutable.String;

public class StringBuilderTest01 {
    public static void main(String[] args) {
//        String str = "A" + "B" + "C" + "D"; // String << 불변객체(값을 바꿀수 없음 final 로 되어있다)

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        stringBuilder.append("D");
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.insert(4, "Spring Boot Fucking");
        System.out.println("stringBuilder = " + stringBuilder); // 가변객체라서 메모리에 객체를 하나만 생성한다.(메모리 절약)
        stringBuilder.delete(0, 6);
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);
        String str = stringBuilder.toString(); // << 가변객체인 StringBuilder 을 String 형태의 불변객체로 바꾼다.
        System.out.println(str);


    }
}
