package ch13.thread.start;

public class ManyThreadMain01 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        for (int i = 0; i <= 50; i++) {
            Thread thread01 = new Thread(helloRunnable);
            thread01.start();
        }

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
