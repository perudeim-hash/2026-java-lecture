package ch10.basic.exception.ex03;

public class NetworkClientException02 extends Exception {
    private String errorCode;

    public NetworkClientException02(String message) {
        super(message);
    }

    public String getErrorCode(){
        return errorCode;
    }
}
