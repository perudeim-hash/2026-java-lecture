package ch13.thread.control.interupt;

import static ch13.Utils.MyLogger.log;
import static ch13.Utils.ThreadUtil.sleep;

public class ThreadStopMain02 {
    public static void main(String[] args) {
        MyTask myTask =new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();
        sleep(4000);
        log("작업 중단 지시 thread.interrupt ");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 = " + thread.isInterrupted());

    }
    static class MyTask implements Runnable  {

        @Override
        public void run() {
            try {
                while (true) {
                    log("작업중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("work 스레드 인터럽트 상태 2 = " + Thread.currentThread().isInterrupted());
                log("interrupt message = " + e.getMessage());
                log("스레드의 상태 = " + Thread.currentThread().getState());
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
