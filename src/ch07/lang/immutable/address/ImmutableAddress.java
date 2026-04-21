package ch07.lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    // 생성자 주입 방식
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
