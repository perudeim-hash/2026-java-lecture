package ch08.enumeration.answer.ex07;

public enum Transport {
    BUS(1200),
    SUBWAY(1400),
    TAXI(4800),
    ;

    private final int Price;

    Transport(int price) {
        Price = price;
    }

    public int getFare(){
        return Price;
    }
}
