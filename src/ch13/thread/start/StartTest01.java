package ch13.thread.start;

import ch13.Utils.MyLogger;

public class StartTest01 {
    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        countThread.start();

    }

    static class CountThread extends Thread {
        @Override
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
    }
}
