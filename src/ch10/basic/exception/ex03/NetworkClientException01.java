package ch10.basic.exception.ex03;

public class NetworkClientException01 extends Exception {
    private String errorCode;

    public NetworkClientException01(String errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode(){
        return errorCode;
    }
}
