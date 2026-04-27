package ch10.basic.exception.ex03;


public class NetworkService02 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient01 networkClient01 = new NetworkClient01(address);
        networkClient01.initError(data);

        try {
            networkClient01.connect();
        } catch (NetworkClientException01 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + "메세지 : " + e.getMessage());
            return;

        }
        try {
            networkClient01.send(data);
        } catch (NetworkClientException01 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + "메세지 : " + e.getMessage());
            return;

        }
        networkClient01.disconnect();

    }
}
