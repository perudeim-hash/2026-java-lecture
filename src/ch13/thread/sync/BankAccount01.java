package ch13.thread.sync;

import ch13.Utils.ThreadUtil;

import static ch13.Utils.MyLogger.log;
import static ch13.Utils.ThreadUtil.sleep;

public class BankAccount01 implements BankAccount {
    volatile private int balance;
    public  BankAccount01(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : " + getClass().getSimpleName());
        log("[검증 시작] 출금액 : " + amount + " / 잔액 : " + balance);
        if (balance < amount) {
            log("[검증 실패] 출금액 : " + amount + " / 잔액 : " + balance);
            return false;
        }
        log("[검증 성공] 출금액 : " + amount + " / 잔액 : " + balance);
        sleep(1000);
        balance -= amount;
        log("[출금 완료] 출금액 : " + amount + " / 잔액 : " + balance);
        log("거래 종료");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
