package review.clazz.class01;

public class ClassStart02{

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "학생1";
        student.age = 19;
        student.grade = 90;
        System.out.println(student.name + " + " + student.age + " + " + student.grade);

        Student student02 = new Student();
        student02.name = "학생2";
        student02.age = 18;
        student02.grade = 96;
        System.out.println(student02.name + " + " + student02.age + " + " + student02.grade);


        Student student03 = student;
        System.out.println(student);
        System.out.println(student02);
        System.out.println(student03);
        student03.name = "학생03";
        System.out.println(student.name + "===" + student03.name);

        Student[] students = new Student[3];
        students[0] = student;
        students[1] = student02;
        students[2] = student03;
        for (Student student1 : students) {
            System.out.println(student1.name + " + " + student1.age + " + " + student1.grade);

        }
    }

}
