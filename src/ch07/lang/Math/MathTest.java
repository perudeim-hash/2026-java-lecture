package ch07.lang.Math;

import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("Math.max(10,20) : " + Math.max(10, 20));
        System.out.println("Math.min(10,20) : " + Math.min(10, 20));
        System.out.println("Math.abs(-10) : " + Math.abs(-10));
        System.out.println("Math.ceil(2.9) : " + Math.ceil(2.9));
        System.out.println("Math.floor(2.5)) : " + Math.floor(2.5));
        System.out.println("Math.round(2.9)) : " + Math.round(2.9));
        System.out.println("Math.sqrt(4)) : " + Math.sqrt(4));
        System.out.println("Math.random()) : " + Math.random());    // 0~1 사이의 16자리의 실수

        Random random = new Random();
        System.out.println("random.nextInt = " + random.nextInt());
        System.out.println("random.nextInt = " + random.nextInt(200));  // 0 ~ 200(내가 지정한 범위의 숫자)까지중 랜덤으로 정수를 뽑아준다
        System.out.println("random.nextDouble() = " + random.nextDouble());
        System.out.println("random.nextBoolean() = " + random.nextBoolean());
        System.out.println("Math.abs(random.nextInt())= " + Math.abs(random.nextInt()));
    }
}
