package ch04;

public class Student002Test {
    public static void main(String[] args) {

        Student002 st01 = new Student002("전세진", 3);
        st01.kor = 80;
        st01.eng = 20;
        st01.math = 30;
        st01.showInfo();
        st01.average();
        st01.total();


        Student002 st02 = new Student002("홍길동", 4);
        st02.kor = 83;
        st02.eng = 21;
        st02.math = 38;
        st02.showInfo();
        st02.average();
        st02.total();


        Student002 st03 = new Student002("이무개", 1);

        st03.kor = 21;
        st03.eng = 31;
        st03.math = 44;

        st03.showInfo();
        st03.average();
        st03.total();


    }

}
