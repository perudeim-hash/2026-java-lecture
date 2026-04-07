package ch01;

public class CircleArea {

    static double circleArea(double radius){

        final double PI = 3.14;
        double result = PI * (radius * radius);

        return result;
    }

    public static void main(String[] args) {

        System.out.println("circleArea() = " + circleArea(10));

    }
}
