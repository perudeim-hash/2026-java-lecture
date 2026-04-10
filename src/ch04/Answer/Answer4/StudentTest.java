package ch04.Answer.Answer4;

public class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student("학생1", 80, 43, 64);
        Student st2 = new Student("학생2", 40, 55, 95);
        Student st3 = new Student("학생3", 74, 23, 47);
        Student st4 = new Student("학생4", 16, 53, 78);
        Student st5 = new Student("학생5", 77, 67, 43);
        st1.getTotal();
        st1.getAverage();

        st2.getTotal();
        st2.getAverage();

        st3.getTotal();
        st3.getAverage();

        st4.getTotal();
        st4.getAverage();

        st5.getTotal();
        st5.getAverage();

    }
}
