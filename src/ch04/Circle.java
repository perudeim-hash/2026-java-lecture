package ch04;

public class Circle {
    int radius = 0;
    String name;

    Circle(){
        System.out.println("내가 만든 생성자");
        radius = 100;
    }

    Circle(int radius){
        System.out.println("매개변수로 만든 생성자");
        this.radius = radius;
    }
    Circle(String name, int radius){
        System.out.println("매개변수로 만든 생성자");
        this.name = name;
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }



}
