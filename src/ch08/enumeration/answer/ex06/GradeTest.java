package ch08.enumeration.answer.ex06;

public class GradeTest {
    public static void main(String[] args) {
        Grade grade = Grade.GOLD;

        System.out.println("할인율 = " + grade.getDiscount() + "%");
    }
}
