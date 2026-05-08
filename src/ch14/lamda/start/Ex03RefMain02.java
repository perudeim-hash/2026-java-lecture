package ch14.lamda.start;

import ch14.lamda.Procedure;

import java.util.Random;

public class Ex03RefMain02 {
    static void hello(Procedure procedure) {
        long startNs = System.nanoTime();

        procedure.run();

        long endNs = System.nanoTime();
        System.out.println("실행 시간 : " + (endNs - startNs) +"ns");
    }
    static class Dice implements Procedure {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 값 = " + randomValue);
        }
    }
    static class Sum implements Procedure {
        @Override
        public void run() {
            for (int i = 0; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
    public static void main(String[] args) {
        Procedure dice = new Dice();
        Procedure sum = new Sum();
        hello(dice);
        hello(sum);
    }
}
