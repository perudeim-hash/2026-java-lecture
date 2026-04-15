package ch06.sender;

public class KakaoSender  implements Sender {
    public void sendMessage(String message) {

        System.out.println("카카오 메시지를 발송합니다. " + message);

    }
}
