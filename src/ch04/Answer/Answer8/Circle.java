package ch04.Answer.Answer8;

public class Circle {
    int a;
    // 3.14 * (radius * radius)


    public Circle(int a) {
        this.a = a;
    }

    void getArea() {
        double radius = (double) 3.14 * (a * a);
        System.out.println("원의 넓이는 : " + radius);
    }
}
