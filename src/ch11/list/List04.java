package ch11.list;

import java.util.ArrayList;

public class List04 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 99, 92, 74));
        students.add(new Student("전우치", 82,11,44));
        students.add(new Student("누군가", 62, 42, 66));
        System.out.println(students.get(0).eng);

    }
}
class Student{
    public String name;
    public int kor;
    public int eng;
    public int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
