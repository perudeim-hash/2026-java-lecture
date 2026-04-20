package review.static01.ex.ex01;

public class ColorTv extends TV {
    int color;
    public  ColorTv(int size, int color) {
        super(size);
        this.color = color;
    }


    public void printProperty() {
        System.out.println(getSize() +  "인치 / " + color + "컬러");

    }
}
