package review.clazz.construct;

public class StudentMain {
    public static void main(String[] args) {
        Student student01 = new Student();
        student01.name = "학생01";
        student01.age = 17;
        student01.grade = 99;

        Student student02 = new Student("학생02", 16, 80);

        Student student03 = new Student("학생03");
        student03.age = 18;
        student03.grade = 85;


        Student student04 = new Student("학생03", 18);
        student03.grade = 77;

        System.out.println(student02.name);
    }
}
