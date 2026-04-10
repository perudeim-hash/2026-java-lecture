package ch04;

public class Student002 {
    String name;
    int grade;
    int kor;
    int eng;
    int math;


    public Student002(String name, int grade) {
        this.name = name;
        this.grade = grade;

    }

    void showInfo(){
        System.out.println("학생의 이름은 : " + name + " / 학년은 : " + grade + " / 국어 점수는 : " + kor + " 영어 점수는 : " + eng + " 수학 점수는 : " + math);

    }

    void average(){
        double average = (double) (kor + eng + math) / 3;
        average = Math.round(average *100)/100.0;
        System.out.println("평균은 : " + average);
    }

    void total(){
        int total = kor + eng + math;
        System.out.println("합계는 : " + total);
    }

}
