package ch03.answer;

public class Answer10 {
    public static void main(String[] args) {

        int[] scores = {55, 70, 85, 40, 90, 60};

        int i;
        int count = 0;
        for ( i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                System.out.println(scores[i]);
                count++;
            }

        }
        System.out.println("합격자 수 " + count);






    }
}
