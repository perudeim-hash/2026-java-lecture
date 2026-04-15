package ch05.pay02;

//ocp(open close principle)
//open 확장에는 열려있어야 하고
//close 기존 코드에는 닫혀있어야 한다.
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
