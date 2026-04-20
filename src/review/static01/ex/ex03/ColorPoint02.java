package review.static01.ex.ex03;

public class ColorPoint02 extends Point{
    String color;

    public  ColorPoint02() {
       int x = 0;
       int  y = 0;
    }

    public ColorPoint02(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }


    @Override
    public String toString() {
        return getX() + "," + getY() + " " + color;
    }
}
