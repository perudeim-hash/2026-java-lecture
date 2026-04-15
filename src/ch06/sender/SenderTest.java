package ch06.sender;

public class SenderTest {



    public static void main(String[] args) {

        Sender[] senders = {new EmailSender(), new SmsSender(), new KakaoSender()};

        for (Sender sender : senders) {
            sender.sendMessage("가입을 축하합니다.");
        }

    }
}
