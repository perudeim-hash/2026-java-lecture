package ch10.basic.exception.ex03;


public class NetworkService06 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient02 networkClient02 = new NetworkClient02(address);
        networkClient02.initError(data);
        try {
            // 정상 흐름
            networkClient02.connect();
            networkClient02.send(data);
        } catch (ConnectException02 e) {
            // 오류 부분
            System.out.println("[오류] 주소 : " + e.getAddress() + "메세지 : " + e.getMessage());
        } catch (SendException02 e) {
            System.out.println("[전송오류] 전송 데이터 오류 : " + e.getSendData() + "메세지 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        } finally {
            // finally -> 무조건 1번은 실행이 된다.
            networkClient02.disconnect();

        }


    }
}
