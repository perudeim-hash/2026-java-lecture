package ch08.enumeration.ex02;

public class StringGradeTest01 {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        int price = 10000;
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
