package ch10.review;

public class NetworkClient02 {
    private final String address;
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
        System.out.println(address+ "서버 연결이 성공됐습니다.");
        return "success";
    }
    public String send(String data){
        if (sendError) {
            System.out.println(address + " 서버 데이터 전송 실패 : " + data);
            return "dataError";
        }
        System.out.println(address+ "서버에 데이터 전송 : " + data);
        return "success";
    }
    public void disconnect(){
        System.out.println(address + "서버 연결을 종료 합니다.");
    }

    public void initError(String data) {
        if (data.contains("error01")) {
            connectError = true;
        }
        if (data.contains("error02")) {
            sendError = true;
        }
    }
}
