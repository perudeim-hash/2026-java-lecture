package ch11.ex.ex05;


import java.util.*;

class Student {
    public String gkrrhk;
    public String gkrwja;
    public String avg;

    public Student(String gkrrhk, String gkrwja, String avg) {

        this.gkrrhk = gkrrhk;
        this.gkrwja = gkrwja;
        this.avg = avg;
    }

}

//(1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에
//저장한 후에, ArrayList<Student>의 모든 학생(4명) 정보를 출력하고
//학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
//(2) ArrayList<Student> 대신, HashMap<String,Student>해시맵을 이용하여 다시 작성하라.
//해시맵에서 키는 학생 이름으로 한다.

public class Test01 {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap();
        Scanner scanner = new Scanner(System.in);
        String input;
        String name;
        String gkrrhk;
        String gkrwja;
        String avg;
        while (true) {

            input = scanner.nextLine();
            if (input.equals("그만")) {
                break;
            }
            System.out.println("학생 이름과 나머지가 입력됐습니다.");
            String[] arr = input.split(" ");
            name = arr[0];
            gkrrhk = arr[1];
            gkrwja = arr[2];
            avg = arr[3];
            students.put(name, new Student(gkrrhk, gkrwja, avg));


        for (int i = 0; i < students.size(); i++) {
            System.out.println("-------------------------");
            System.out.print("이름 : " +input + " ");
            System.out.print("학과 : " +students.get(input).gkrrhk + " ");
            System.out.print("학점 : " +students.get(input).gkrwja + " ");
            System.out.print("평균 : " +students.get(input).avg + " ");
            System.out.println();
            System.out.println("-------------------------");

        }
        }























//
//
//
//        students.add(new Student("황기태", "모바일", 1, 4.1));
//        students.add(new Student("이재문", "안드로이드",2,3.9));
//        students.add(new Student("김남윤", "빅데이터", 3, 3.5));
//        students.add(new Student("최찬미", "웹공학", 4, 4.75));
//
//        for (int i = 0; i < students.size(); i++) {
//            System.out.println("-------------------------");
//            System.out.print("이름 : " +students.get(i).name + " ");
//            System.out.print("학과 : " +students.get(i).gkrrhk + " ");
//            System.out.print("학점 : " +students.get(i).gkrwja + " ");
//            System.out.print("평균 : " +students.get(i).avg + " ");
//            System.out.println();
//            System.out.println("-------------------------");
//
//        }

    }
}
