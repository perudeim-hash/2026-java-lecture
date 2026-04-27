package ch10.basic.exception.ex03;


public class NetworkService03 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient01 networkClient01 = new NetworkClient01(address);
        networkClient01.initError(data);

        try {
            // 정상 흐름
            networkClient01.connect();
            networkClient01.send(data);
            networkClient01.disconnect();

        } catch (NetworkClientException01 e) {
            // 오류 부분
            System.out.println("[오류] 코드 : " + e.getErrorCode() + "메세지 : " + e.getMessage());

        }

    }
}
