package review.static01;

public class DataCountTest01 {
    public static void main(String[] args) {

        Data01 data01 = new Data01("data01");
        Data01 data02 = new Data01("data02");
        Data01 data03 = new Data01("data03");
        System.out.println("data01.count = " + data01.count);
        System.out.println("data02.count = " + data02.count);
        System.out.println("data03.count = " + data03.count);
    }
}
