package ch10.basic.exception.ex01;

public class NetworkService01 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient01 networkClient01 = new NetworkClient01(address);
        networkClient01.connect();
        networkClient01.send(data);
        networkClient01.disconnect();

    }
}
