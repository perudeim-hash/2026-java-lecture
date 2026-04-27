package ch10.basic.exception.ex03;


public class NetworkService01 {
    public void sendMessage(String data) throws NetworkClientException01 {
        String address = "http://example.com";
        NetworkClient01 networkClient01 = new NetworkClient01(address);
        networkClient01.initError(data);

        networkClient01.connect();
        networkClient01.send(data);
        networkClient01.disconnect();

    }
}
