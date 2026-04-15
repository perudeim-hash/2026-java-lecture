package ch05.pay02;

public class PayService {
    public void payProcess(String option, int amount) {
        System.out.println("결제를 시작합니다. option : " + option + " , amount : " + amount);
        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);
        if (result) {
            System.out.println("걸제를 성공 했습니다." + option + " 은행 " + amount + " 원 입니다.");
        } else {
            System.out.println("결제에 실패 했습니다.");
        }


    }
}
