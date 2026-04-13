package ch05.inherit;

public class PointTest {
    public static void main(String[] args) {

        Point point = new Point();
        point.x = 10;
        point.y = 10;
        point.showPoint();

        ColorPoint colorPoint = new ColorPoint();
        colorPoint.color = "red";
        colorPoint.x = 20;
        colorPoint.y = 20;
        colorPoint.showColorPoint();


        PointShot pointShot = new PointShot();

        pointShot.x = 20;
        pointShot.y = 30;
        pointShot.showPointShot();


    }
}
