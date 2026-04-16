package review.loop;

public class While01 {
    public static void main(String[] args) {
        int count = 0;
//        long start = System.nanoTime();
        while (count < 100) {
            count++;
            if (count % 5 == 0) {
                break;
            }
            System.out.println(count);
        }
//        long start1 = System.nanoTime();
//
//        System.out.println(start1 - start);
//        System.out.println((start1 - start) / 1_000_000.0);

    }
}
