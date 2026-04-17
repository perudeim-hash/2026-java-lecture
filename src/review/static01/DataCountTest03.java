package review.static01;

public class DataCountTest03 {
    public static void main(String[] args) {
        Data03 data01 = new Data03("data1");
        System.out.println(Data03.count);
        Data03 data02 = new Data03("data2");
        System.out.println(Data03.count);

        Data03 data03 = new Data03("data3");
        System.out.println(Data03.count);

    }
}
