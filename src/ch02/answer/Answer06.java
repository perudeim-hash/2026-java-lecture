package ch02.answer;

public class Answer06 {
    public static void main(String[] args) {

        int num = 33;
        int ten = num / 10;
        int one = num % 10;
        int count = 0;

        if (ten != 0 &&  ten % 3 == 0) {
            count++;
        }

        if (one != 0 && one % 3 == 0) {
            count++;
        }
        if (count == 1) {
            System.out.println("박수 짝");
        } else if (count == 2) {
            System.out.println("박수 짝짝");
        } else {
            System.out.println("박수 없음");

        }
    }
}
