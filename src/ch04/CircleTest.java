package ch04;

public class CircleTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 10;
        circle.name = "자바 피자";
        double area = circle.getArea();
        System.out.println(circle.name + "의 면적은 : " + area + " 입니다.");

        Circle donut = new Circle("자바 도넛!!!!",13);
        double area02 = donut.getArea();
        System.out.println(donut.name + "의 면적은 : " + area02 + " 입니다.");


        Circle qweqeqe = new Circle(2);

        qweqeqe.name = "qwer";
        double area03 = qweqeqe.getArea();
        System.out.println(qweqeqe.name + "의 면적은 : " + area03 + " 입니다.");
    }


}


