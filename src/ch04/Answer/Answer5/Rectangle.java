package ch04.Answer.Answer5;

public class Rectangle {
    int width;
    int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void getArea() {;
        int area = width * height;
        System.out.println("넓이는 : " + area);

    }
    void getPerimeter() {
        int perimeter = 2 * width + height * 2;
        System.out.println("둘레는 : " + perimeter);

    }



}
