package ch05.pay01;

public class PayMain {
    public static void main(String[] args) {
        PayService payService = new PayService();

        String payOption01 = "kakao";
        int amount = 10000;
        payService.payProcess(payOption01, amount);



        String payOption02 = "naver";
        int amount02 = 40000;
        payService.payProcess(payOption02, amount02);





    }
}
