package ch10.basic.exception.checked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckException e ) {
            System.out.println("예외 처리 발생. Message = " + e.getMessage());
        }
        System.out.println("정상적으로 작동");
    }
    public void callThrow() throws MyCheckException {
        client.call();

    }
}
