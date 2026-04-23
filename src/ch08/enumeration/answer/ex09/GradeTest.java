package ch08.enumeration.answer.ex09;

public class GradeTest {
    public static void main(String[] args) {
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            if (grade.name().equals("DIAMOND")) {
                System.out.println("다이아몬드를 찾았습니다. : " + grade.name());
            }

        }
    }
}
