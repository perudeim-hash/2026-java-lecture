package ch10.basic.exception.ex02;

public class NetworkClient02 {
    private String address;

    public boolean connectError;
    public boolean sendError;

    public NetworkClient02(String address) {
        this.address = address;
    }


    public String connect(){
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버 데이터 전송 실패 : " + data);
            return "sendError";
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
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
