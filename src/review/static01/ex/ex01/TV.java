package review.static01.ex.ex01;

public class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "size=" + size +
                ", getSize()= + " + getSize() + '}';
    }

}
