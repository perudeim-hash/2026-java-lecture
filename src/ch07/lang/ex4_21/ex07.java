package ch07.lang.ex4_21;

import java.util.Random;

public class ex07 {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int j = random.nextInt(100 + 1);
            sum += j;
            count = i;
            System.out.println("생성된 수 : " + j);
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " +(double) sum/count);
    }
}
