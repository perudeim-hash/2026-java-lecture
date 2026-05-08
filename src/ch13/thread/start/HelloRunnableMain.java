package ch13.thread.start;

import ch13.Utils.MyLogger;

public class HelloRunnableMain {
    public static void main(String[] args) {
        MyLogger.log("main() start");
//        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
//        System.out.println(Thread.currentThread().getName() + ": main() end");
        MyLogger.log("main() end");

    }
}
