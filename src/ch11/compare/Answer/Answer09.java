package ch11.compare.Answer;

import java.util.Arrays;
import java.util.Comparator;

public class Answer09 {
    public static void main(String[] args) {


    Student[] students = {
            new Student("kim", 80, 90),
            new Student("lee", 90, 70),
            new Student("park", 85, 85),
            new Student("choi", 90, 90)
    };
        Arrays.sort(students, new StudentComparator());
        System.out.println(Arrays.toString(students));

    }
}


class Student {
    String name;
    int kor;
    int eng;

    public Student(String name, int kor, int eng) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getTotal(){
        return kor + eng;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                '}';
    }




}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = Integer.compare(o1.getTotal(), o2.getTotal());
        if (result == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
