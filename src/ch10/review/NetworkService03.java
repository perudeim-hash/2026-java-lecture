package ch10.review;

public class NetworkService03 {
    public void sendMessage(String data) {


        String address = "http://example.com";
        NetworkClient02 client = new NetworkClient02(address);
        client.initError(data);
        String connectResult = client.connect(); // 연결실패시 connectError 성공하면 success
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류] 오류 코드는 : "+ connectResult);
            return;
        }

        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[데이터 전송 오류] 오류 코드는 : "+ sendResult);
            return;
        }
        client.disconnect();

    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
