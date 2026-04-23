package ch08.enumeration.answer.ex02;

public class GradeTest05 {
    public static void main(String[] args) {
        String str = "VIP";
        try {
            Grade.valueOf(str);
            System.out.println("등급은 : " + str + " 입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println("존재하지 않는 등급입니다. : " + e);
        }

    }
}
