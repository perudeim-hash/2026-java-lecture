package ch13.thread.start;

import ch13.Utils.MyLogger;

public class StartTest03 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 0; i <= 50; i++) {
                    MyLogger.log("value : " + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };

        Thread countThread = new Thread(runnable, "counter");
        countThread.start();

    }
}
