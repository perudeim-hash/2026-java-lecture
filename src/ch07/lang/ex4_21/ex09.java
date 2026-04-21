package ch07.lang.ex4_21;

import java.util.Random;

public class ex09 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(6) + 1;
        int b = random.nextInt(6) + 1;
        int sum = a + b;


        System.out.println("첫 번째 주사위 " + a);
        System.out.println("두 번째 주사위 " + b);
        System.out.println("합계 : "  + sum);


    }
}
