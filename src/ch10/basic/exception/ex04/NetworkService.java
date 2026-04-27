package ch10.basic.exception.ex04;


public class NetworkService {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient networkClient = new NetworkClient(address);
        networkClient.initError(data);
        try {
            networkClient.connect();
            networkClient.send(data);
        }finally {
            networkClient.disconnect();

        }


    }
}
