package ch10.basic.exception.ex03;


public class NetworkService05 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient01 networkClient01 = new NetworkClient01(address);
        networkClient01.initError(data);
        try {
            // 정상 흐름
            networkClient01.connect();
            networkClient01.send(data);
        } catch (NetworkClientException01 e) {
            // 오류 부분
            System.out.println("[오류] 코드 : " + e.getErrorCode() + "메세지 : " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("[오류] 코드 : " + "이 오류는 런타임오류입니다." + "메세지 : " + e.getMessage());
        } finally {
            // finally -> 무조건 1번은 실행이 된다.
            networkClient01.disconnect();

        }


    }
}
