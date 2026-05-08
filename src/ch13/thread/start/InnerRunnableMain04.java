package ch13.thread.start;

import ch13.Utils.MyLogger;

public class InnerRunnableMain04 {
    public static void main(String[] args) {
        MyLogger.log("main() start");
//        익명 클래스 << 람다랑 연결된다
//        람다식은 구현해야 하는 메서드가 한개의 인터페이스를 구현해야 할때 사용 가능하다.
        Thread thread = new Thread(() -> MyLogger.log("run()"));
        thread.start();
        MyLogger.log("main() end");

    }


}

