package ch07.lang.ex4_21;

import java.util.Random;

public class ex06 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(45) + 1;
            System.out.println( j);
        }
    }
}
