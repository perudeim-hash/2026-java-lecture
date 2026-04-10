package ch04.Answer.Answer4;

public class Student {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    void getTotal() {
        int total = kor + eng + math;
        System.out.println("총점은 : " + total + " 점 입니다.");

    }

    void getAverage() {
        double average = (kor + eng + math) / 3.0;
        average = Math.round(average * 100) / 100.0;
        System.out.println("평균은 : " + average + " 점 입니다.");
    }
}
