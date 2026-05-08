package ch13.thread.start;

import ch13.Utils.MyLogger;

public class StartTest04 {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new PrintWork("AAA", 1000));
        Thread thread02 = new Thread(new PrintWork("BBB", 500));
        thread01.start();
        thread02.start();

    }
    static class PrintWork implements Runnable{
        private String content;
        private int sleepMilli;

        public PrintWork(String content, int sleepMilli) {
            this.content = content;
            this.sleepMilli = sleepMilli;
        }

        @Override
        public void run() {
            while (true) {
                MyLogger.log(content);
                try {
                    Thread.sleep(sleepMilli);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
