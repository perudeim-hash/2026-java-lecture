package ch04.Answer.Answer7;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    //입금
    void deposit(int money) {
        balance = balance + money;

        System.out.println(balance + "원을 입금 합니다.");
    }
    //입금
    void withdraw(int money) {
        if ((balance - money) < 0) {
            System.out.println("잔액이 부족합니다." + "잔액 : " +  balance);

        }else {
            balance = balance - money;
            System.out.println(money + "원을 출금 합니다.");
        }
    }

    void showBalance() {
        System.out.println("현재 잔액은 : " + balance);
        }
    }




