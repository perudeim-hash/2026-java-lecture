package ch03.answer2;

public class Answer01 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                continue;
            }
            sum = i + sum;
            System.out.println("i = " + i);
        }
        System.out.println(sum);


        int i = 0;
        int sum01 = 0;
        while (i < 100) {
            if (i % 2 == 1) {
                i++;
                continue;
            }
            sum01 = i + sum01;
            i++;
        }
        System.out.println(sum01);

    }
}
