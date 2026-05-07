package ch13.thread.start;

public class ManyThreadMain02 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100; i++) {
            Thread thread01 = new Thread(helloRunnable);
            thread01.start();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("총 소요 시간 : " + (endTime - startTime));
        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
