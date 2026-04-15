package ch05.pay02;

public class DefaultPay implements Pay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제가 실패 했습니다.");
        return false;
    }
}
