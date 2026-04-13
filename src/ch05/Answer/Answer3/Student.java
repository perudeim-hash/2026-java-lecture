package ch05.Answer.Answer3;

public class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {

        super(name, age);
        this.grade = grade;
    }



    void showInfo() {

        System.out.println("이름 : " + name + " / 나이 : " + age
                + " / 학년 : " + grade);
    }
}
