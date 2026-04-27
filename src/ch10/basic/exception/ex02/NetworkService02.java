package ch10.basic.exception.ex02;

public class NetworkService02 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient02 networkClient02 = new NetworkClient02(address);
        networkClient02.initError(data);

        networkClient02.connect();
        networkClient02.send(data);
        networkClient02.disconnect();

    }
}
