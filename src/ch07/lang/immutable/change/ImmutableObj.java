package ch07.lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableObj add(int addValue) {
//        value = value + addValue;
        int result = value + addValue;
        return new ImmutableObj(result);
    }

}
