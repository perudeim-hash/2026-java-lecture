package ch11.ex.ex07;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("황기태",new Student("황기태",  4.1));
        studentMap.put("이재문",new Student("이재문", 3.9));
        studentMap.put("김남윤",new Student("김남윤",  3.5));
        studentMap.put("최찬미",new Student("최찬미",   4.75));
        double scholarship = 3.5;
        Set<String> keySet = studentMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Student student = studentMap.get(iterator.next());
            if (student.score > scholarship) {
                System.out.print(student.name + " / ");
            }
        }
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String key = entry.getKey();

            double value = entry.getValue().score;

            System.out.println();
            if (value > scholarship) {
                System.out.println(key + "의 점수는 : " + value);
            } else {
                System.out.println("불합격은? : "+  key);
            }

        }

    }
}

class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}