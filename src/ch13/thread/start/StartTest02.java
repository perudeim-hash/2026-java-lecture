package ch13.thread.start;

import ch13.Utils.MyLogger;

public class StartTest02 {
    public static void main(String[] args) {
        Thread countThread = new Thread(new CountRunnable(), "count");
        countThread.start();
    }
    static class CountRunnable implements Runnable {
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
