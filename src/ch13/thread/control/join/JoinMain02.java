package ch13.thread.control.join;

import ch13.Utils.ThreadUtil;

import static ch13.Utils.MyLogger.log;

public class JoinMain02 {
    public static void main(String[] args) {
        log("start");
        SumTask sumTask01 = new SumTask(1, 150);
        SumTask sumTask02 = new SumTask(151, 300);
        Thread thread01 = new Thread(sumTask01);
        Thread thread02 = new Thread(sumTask02);
        thread01.start();
        thread02.start();
        log("main thread sleep ");
        ThreadUtil.sleep(3000);
        log("main thread sleep end ");

        log("sumTask01.result = " + sumTask01.result);
        log("sumTask02.result = " + sumTask02.result);
        int sumAll = sumTask01.result + sumTask02.result;
        log("sumTask01 + sumTask02 = " + sumAll);
        log("end");

    }

    static class SumTask implements Runnable {
        int startValue ;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작 : ");
            ThreadUtil.sleep(2000);
            int sum=0;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 result = " + result);
        }
    }
}
