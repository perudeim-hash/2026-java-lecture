package ch08.enumeration.answer.ex02;

public class GradeTest03 {
    public static void main(String[] args) {

        Grade[] grades = Grade.values();

        for (Grade grade1 : grades) {
            System.out.println(grade1.name() + " / " + grade1.ordinal());

        }

    }
}
