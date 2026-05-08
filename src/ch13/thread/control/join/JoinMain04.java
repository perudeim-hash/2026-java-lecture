package ch13.thread.control.join;

import ch13.Utils.ThreadUtil;

import static ch13.Utils.MyLogger.log;

public class JoinMain04 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask sumTask01 = new SumTask(1, 150);
        Thread thread01 = new Thread(sumTask01);
        thread01.start();
        log("join() - main thread 는 thread01 종료까지 2초 대기 ");
        thread01.join(1003);
        log("main thread 대기가 끝남.");
        log("sumTask01.result = " + sumTask01.result);
        int sumAll = sumTask01.result;
        log("sumTask01 = " + sumAll);
        log("end");

    }

    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작 : ");
            long startTime = System.currentTimeMillis();

            ThreadUtil.sleep(200);
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            long endTime = System.currentTimeMillis();

            log("작업 완료 result = " + result);
            log("스레드 작업 시간 = " + (endTime - startTime) + "ms");
        }
    }
}
