package ch05.Answer.Answer5;

public class Circle extends Shape{

    @Override
    void area() {
        double r = 40;
        System.out.println("Circle 의 반지름은 : " + (3.14 * (r * r)) + " 입니다.");
    }
}
