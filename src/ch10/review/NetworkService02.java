package ch10.review;

public class NetworkService02 {
    public void sendMessage(String data) {


        String address = "http://example.com";
        NetworkClient02 client = new NetworkClient02(address);
        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
