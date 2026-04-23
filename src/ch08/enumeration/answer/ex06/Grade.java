package ch08.enumeration.answer.ex06;

public enum Grade {
    BASIC(0),
    GOLD(10),
    DIAMOND(20),
    ;

    private final int discount;

    Grade(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {

        return discount;
    }
}
