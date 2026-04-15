package ch05.pay01;

public class KaKaoPay {
    public boolean pay(int amount){
        System.out.println("카카오페이 시스템과 연결을 시도합니다.");
        System.out.println(amount + "원을 결제 합니다.");
        return true;
    }
}
