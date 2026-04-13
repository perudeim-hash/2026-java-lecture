package ch05.inherit;

public class Point {
    int x;
    int y;


    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.println("x = " + x + " y = " + y);
    }
}
