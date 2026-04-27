package ch10.basic.exception.ex04;

public class NetworkClient {
    private String address;

    public boolean connectError;
    public boolean sendError;

    public NetworkClient(String address) {
        this.address = address;
    }


    public void connect() throws ConnectException  {
        if (connectError) {
            throw new ConnectException (address, address + "연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendException  {
        if (sendError) {
            throw new SendException (data, address + " 서버에 데이터 연결 실패 : " + data);
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제.");
    }

    public void initError(String data) {
        // contains << 포함을 하고 있냐? 를 물어본다.
        if (data.contains("error01")) {
            connectError = true;
        }
        if (data.contains("error02")) {
            sendError = true;

        }

    }
}
