package review.array;

public class Array01 {
    public static void main(String[] args) {
        int[] students = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < students.length; i++) {
            System.out.println("students = " + students[i]);
        }


        for (int student : students) {
            System.out.println("student = " + student);

        }
    }
}
