package ch13.thread.start;

import ch13.Utils.MyLogger;

public class InnerRunnableMain02 {
    public static void main(String[] args) {
        MyLogger.log("main() start");
//        익명 클래스 << 람다랑 연결된다

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() end");
        
    }
}

