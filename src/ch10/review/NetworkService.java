package ch10.review;

public class NetworkService {
    public void sendMessage(String data) {


        String address = "http://example.com";
        NetworkClient client = new NetworkClient(address);
        client.connect();
        client.send(data);
        client.disconnect();

    }
}
