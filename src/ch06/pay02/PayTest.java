package ch06.pay02;

public class PayTest {
    public static void main(String[] args) {
        PayService payService = new PayService();
        String payOption01 = "kakao";
        int amount01 = 30000;
        payService.processPay(payOption01, amount01);

        String payOption02 = "naver";
        int amount02 = 70000;
        payService.processPay(payOption02, amount02);

        String payOption03 = "toss";
        int amount03 = 100000;
        payService.processPay(payOption03, amount03);

        String payOption04 = "이상한 페이";
        int amount04 = 100000;
        payService.processPay(payOption04, amount04);




    }
}
