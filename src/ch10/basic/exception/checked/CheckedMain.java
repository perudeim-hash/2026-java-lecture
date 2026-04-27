package ch10.basic.exception.checked;

public class CheckedMain {
    public static void main(String[] args) {
        Service service = new Service();
//        service.callCatch();
        try {
            service.callThrow();

        } catch (MyCheckException e) {
            System.out.println("예외 처리 . Message = " + e.getMessage());

        }

        System.out.println("정상 종료");

    }
}
