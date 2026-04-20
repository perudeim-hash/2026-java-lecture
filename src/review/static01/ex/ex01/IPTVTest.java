package review.static01.ex.ex01;

public class IPTVTest {
    public static void main(String[] args) {
        ColorTv myTV = new ColorTv(32,1024);
        myTV.printProperty();
        IPTv ipTv = new IPTv("192.1.1.2", 32, 2048);
        ipTv.printProperty();
    }
}
