package ch10.review;

public class NetworkClient {
    private final String address;

    public NetworkClient(String address) {
        this.address = address;
    }
    public String connect(){
        System.out.println(address+ "서버 연결이 성공됐습니다.");
        return "success";
    }
    public String send(String data){
        System.out.println(address+ "서버에 데이터 전송 : " + data);
        return "success";
    }
    public void disconnect(){
        System.out.println(address + "서버 연결을 종료 합니다.");
    }
}
