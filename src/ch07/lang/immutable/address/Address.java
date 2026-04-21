package ch07.lang.immutable.address;

public class Address {
    private String value;

    public Address(String value) {
        this.value = value;
    }
    // 값을 바꾸고 싶을때는 setter
    public void setValue(String value) {
        this.value = value;
    }
    // 값을 얻고 싶을때는 getter
    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
