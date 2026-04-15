package ch05.pay02;

public abstract class PayStore {
    public static Pay findPay(String option){
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }else {
            return new DefaultPay();
        }

    }
}
