package ch02.answer;

public class Answer05 {
    public static void main(String[] args) {

        int a = 30, b = 10, c = 10;

        if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("세 숫자 " +"a = " +  a + " b = " + b + " c = " + c +" 는 " + "삼각형이 가능 하지 않습니다.");
        } else {
            System.out.println("세 숫자 " +"a = " +  a + " b = " + b + " c = " + c +" 는 " + "삼각형이 가능 합니다.");
        }

    }
}
