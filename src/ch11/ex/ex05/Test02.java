package ch11.ex.ex05;


import java.util.*;

class Student02 {
    String name;
    String department;
    int id;
    double avg;

    public Student02(String name, String department, int id, double avg) {
        this.name = name;
        this.department = department;
        this.id = id;
        this.avg = avg;
    }



    @Override
    public String toString() {
        return "Student02{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", avg=" + avg +
                '}';
    }
}

public class Test02 {
    public static void main(String[] args) {
        Map<String, Student02> studentList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        studentList.put("황기태", new Student02("황기태", "모바일", 1, 4.1));
        studentList.put("이재문", new Student02("이재문", "안드로이드", 2, 3.9));
        studentList.put("김남윤", new Student02("김남윤", "빅데이터", 3, 3.5));
        studentList.put("최찬미", new Student02("최찬미", "웹공학", 4, 4.75));



        Set<String> keySet = studentList.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(studentList.get(iterator.next().toString()));
        }

        for (Map.Entry<String, Student02> entry : studentList.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().toString();
            System.out.println(key + ": " + value);

        }

        while (true) {
            System.out.println("이름을 입력하세요");
            String name = scanner.nextLine();
            if (name.equals("그만")) {
                break;
            }
            Student02 findedStudent02 = studentList.get(name);
            System.out.println(findedStudent02.name + "," + findedStudent02.department + "," + findedStudent02.id + "," + findedStudent02.avg);


        }
    }
    }

