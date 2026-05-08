package ch13.thread.control.interupt;

import static ch13.Utils.MyLogger.log;
import static ch13.Utils.ThreadUtil.sleep;

public class ThreadStopMain03 {
    public static void main(String[] args) {
        MyTask myTask =new MyTask();
        Thread thread = new Thread(myTask);
        thread.start();
        sleep(100);
        log("작업 중단 지시 thread.interrupt ");
        thread.interrupt();
        log("work 스레드 인터럽트 상태 1 = " + thread.isInterrupted());

    }
    static class MyTask implements Runnable  {

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                log("작업중");
            }
            log("work 스레드 인터럽트 상태 2 = " + Thread.currentThread().isInterrupted());
            try {
                log("자원 정리");
                Thread.sleep(1000);
                log("자원 종료");
            } catch (InterruptedException e) {
                log("자원정리 실패 - 자원정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태 3 = " + Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
    }
}
