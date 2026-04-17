package review.memory;

public class Memory02 {
    public static void main(String[] args) {
        System.out.println("main start");
        method01();
        System.out.println("main end");

    }

    static void method01() {
        System.out.println("method01 start");
        Data data01 = new Data(10);
        method02(data01);
        System.out.println("method01 end");

    }
    static void method02(Data data02) {
        System.out.println("method02 start");
        System.out.println("data.value = " + data02.getValue());
        System.out.println("method02 end");

    }

}
