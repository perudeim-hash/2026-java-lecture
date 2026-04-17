package review.static01;

public class DataCountTest02 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data02 data01 = new Data02("data01",counter);

        System.out.println("data01.count = " + counter.count);
        Data02 data02 = new Data02("data02",counter);

        System.out.println("data02.count = " + counter.count);
        Data02 data03 = new Data02("data03", counter);
        System.out.println("data03.count = " + counter.count);
    }
}
