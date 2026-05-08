package ch13.thread.control;

import ch13.thread.start.HelloRunnable;

import static ch13.Utils.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());


        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());
        myThread.start();
        log("myThread.getState() = " + myThread.getState());

        // NEW(새로 만든 객체) / RUNNABLE(시작 상태) / BLOCKED / WAITING / TIME_WAITING / TERMINATED (종료 상태)
    }
}
