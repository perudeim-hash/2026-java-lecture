package ch10.basic.exception.ex03;

public class ConnectException02 extends  NetworkClientException02{

    private final String address;



    public ConnectException02(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
