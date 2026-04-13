package ch05.inherit;

public class ClassTest {
    public static void main(String[] args) {
        System.out.println("========== Student ============");
        Student student = new Student();
        student.qw();
        student.study();

        System.out.println("========== StudentWorker ============");
        StudentWorker student1 = new StudentWorker();
        student1.qw();
        student1.study();
        student1.work();

        System.out.println("========== Researcher ============");
        Researcher rc = new Researcher();
        rc.sleep();
        rc.eat();
        rc.speak();
        rc.walk();
        rc.research();


        System.out.println("========== Professor ============");
        Professor pf = new Professor();
        pf.sleep();
        pf.eat();
        pf.speak();
        pf.walk();
        pf.research();
        pf.teach();


    }
}
