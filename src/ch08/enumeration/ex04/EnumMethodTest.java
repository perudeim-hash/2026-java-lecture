package ch08.enumeration.ex04;

public class EnumMethodTest {
    public static void main(String[] args) {
//        System.out.println("Grade.valueOf() = " + Grade.valueOf("GOLD"));
//        System.out.println("Grade.valueOf() = " + Grade.valueOf("BASIC"));
//        System.out.println("Grade.valueOf() = " + Grade.valueOf("DIAMOND"));
//        System.out.println(Grade.BASIC.name());
//        System.out.println(Grade.GOLD.name());
//        System.out.println(Grade.DIAMOND.name());
//
//        System.out.println(Grade.BASIC.ordinal());
//        System.out.println(Grade.DIAMOND.ordinal()); // ENUM에 선언되어있는 순서를 출력함(0,1,2))
//        System.out.println(Grade.GOLD.ordinal()); // ordinal은 사용하지 말기


        Grade[] values = Grade.values();
        for (Grade value : values) {
            System.out.println(value.ordinal() + " / " + value.name());
        }

        Grade gold = Grade.GOLD;
        if (gold.name().equals("GOLD")) {
            // 문자로 넘어올때만
            System.out.println("GOLD");
        }
        if (gold == Grade.GOLD) {
            //가급적으로 이것을 사용
            System.out.println("GOLD");
        }
        if (gold.ordinal() == 2) {
            System.out.println("GOLD");
        }



    }
}
