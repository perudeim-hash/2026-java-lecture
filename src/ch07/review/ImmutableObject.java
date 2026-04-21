package ch07.review;

public class ImmutableObject {
    public static void main(String[] args) {

        Address address01 = new Address("일산");
        Address address02 = new Address("서울");
        Address address03 = address02.newSetValue("부산");

        System.out.println("address01 = " + address01);
        System.out.println("address02 = " + address02);
        System.out.println("address03 = " + address03);

    }
}


class Address {
    private final String value;

    // 생성자 주입 방식
    public Address(String value) {
        this.value = value;
    }

    public Address newSetValue(String value) {
        return new Address(value);
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }



}
