package ch11.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set02 {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("장동건"));
        students.add(new Student("장동건"));
        System.out.println(students.size());
    }
}

class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
 */


}
