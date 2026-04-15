package ch06.pay02;

public class PayStore {
    public static Pay findPay(String option) {
//        if (option.equals("kakao")) {
//            return new KakaoPay();
//        } else if (option.equals("naver")) {
//            return new NaverPay();
//        } else if (option.equals("toss")) {
//            return new TossPay();
//        } else {
//            return new DefaultPay();
//        }

        return switch (option) {
            case "kakao" -> new KakaoPay();
            case "naver" -> new NaverPay();
            case "toss" -> new TossPay();
            default -> new DefaultPay();
        };
    }
}
