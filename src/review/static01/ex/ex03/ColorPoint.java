package review.static01.ex.ex03;

public class ColorPoint extends Point {
    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getX() + "," + getY() + " " + color;
    }
}
