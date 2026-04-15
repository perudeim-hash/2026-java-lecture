package ch06.sender;

public class SmsSender implements Sender {
    public void sendMessage(String message) {

        System.out.println("문자를 발송합니다. " + message);
    }
}
