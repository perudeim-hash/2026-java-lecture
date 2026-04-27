package ch10.basic.exception.ex02;

public class NetworkService02_02 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient02 networkClient02 = new NetworkClient02(address);
        networkClient02.initError(data);
        String connectResult = networkClient02.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : "+connectResult);
            return;
        }
        String sendResult = networkClient02.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : "+sendResult);
            return;
        }
        networkClient02.disconnect();

    }

    public static boolean isError(String error) {
        return !error.equals("success");
    }
}
