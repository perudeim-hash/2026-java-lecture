package ch13.thread.control.interupt;

import static ch13.Utils.MyLogger.log;
import static ch13.Utils.ThreadUtil.sleep;

public class ThreadStopMain01 {
    public static void main(String[] args) {
        MyTask myTask =new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();
        sleep(4000);
        log("작업 중단 지시 runFlag = false ");
        myTask.runFlag = false;
    }

    static class MyTask implements Runnable {
        boolean runFlag = true;

        @Override
        public void run() {
            while (runFlag) {
                log("작업중");
                sleep(3000);
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
