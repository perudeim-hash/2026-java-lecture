package ch14.lamda.methodRef;

import java.util.function.BinaryOperator;

public class MethodRefStart03 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add01 = MethodRefStart03::add;
        BinaryOperator<Integer> add02 = MethodRefStart03::add;
        Integer result01 = add01.apply(10, 20);
        Integer result02 = add02.apply(10, 20);
        System.out.println("result01 = " + result01);
        System.out.println("result02 = " + result02);
    }

    static int add(int x, int y) {
        return x + y;
    }
}
// 1. 정적(static) 메서드 참조
// 2. 특정 객체의 instance 메서드 참조 가능?
// 3. 생성자 참조 가능
// 4. 임의 객체의 인스턴스 메서드 참조 가능
