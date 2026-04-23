package ch08.enumeration.answer.ex07;

public class TransportTest {
    public static void main(String[] args) {
        Transport transport = Transport.TAXI;

        System.out.println(transport.name() + "요금 : " + transport.getFare()+"원");
    }
}
