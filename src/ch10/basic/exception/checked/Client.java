package ch10.basic.exception.checked;

public class Client {
    public void call() throws MyCheckException{
        throw new MyCheckException("ex");
    }

}
