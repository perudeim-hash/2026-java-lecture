package review.static01.ex.ex01;

public class IPTv extends ColorTv {
    String IP;
    public IPTv(String IP, int size, int color) {
        super(size, color);
        this.IP = IP;
    }

    public void printProperty() {
        System.out.println("나의 IPTV는 " + IP + "의 주소를 가지고 있고. " +  getSize() +  "인치 / " + color + "컬러");

    }

}
