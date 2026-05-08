package ch13.thread.sync;

import ch13.Utils.ThreadUtil;

import static ch13.Utils.MyLogger.log;
import static ch13.Utils.ThreadUtil.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount02(1000);
        Thread thread01 = new Thread(new WithDrawTask(bankAccount, 800),"thread01");
        Thread thread02 = new Thread(new WithDrawTask(bankAccount, 800),"thread02");
        thread01.start();
        thread02.start();
        sleep(500);
        log("thread01 state : " + thread01.getState());
        log("thread02 state : " + thread02.getState());

        thread01.join();
        thread02.join();

        log("최종 잔액 : " + bankAccount.getBalance());
    }
}
