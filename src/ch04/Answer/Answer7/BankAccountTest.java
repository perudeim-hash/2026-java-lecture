package ch04.Answer.Answer7;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount("농협은행", 0);

        ba.deposit(2500);
        ba.deposit(3500);

        ba.showBalance();
        ba.withdraw(3000);
//        ba.withdraw(7000);

        ba.showBalance();


    }
}
